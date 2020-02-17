package life.majiang.community.provider;

import com.alibaba.fastjson.JSON;
import life.majiang.community.dto.AccessTokenDTO;
import life.majiang.community.dto.GithubUser;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Component;


import java.io.IOException;

/**
 * @author plancer16
 * @create 2020-01-15 9:56
 */
@Component
public class GithubProvider {
    public String getAccessToken(AccessTokenDTO accessTokenDTO){
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(JSON.toJSONString(accessTokenDTO), mediaType);
        Request request = new Request.Builder()
                    .url("https://github.com/login/oauth/access_token?client_id="
                    +accessTokenDTO.getClient_id()+"&client_secret="+accessTokenDTO.getClient_secret()+"" +
                            "&code="+accessTokenDTO.getCode()+"&redirect_uri="+
                            accessTokenDTO.getRedirect_uri()+"&state="+accessTokenDTO.getState())
                    .post(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                    String string = response.body().string();
                String token = string.split("&")[0].split("=")[1];
                    return token;
                } catch (Exception e) {
                e.printStackTrace();
                }
            return null;
            }

    public GithubUser getUser(String accessToken){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                    .url("https://api.github.com/user?access_token="+accessToken)
                    .build();

        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();//Json样式
            GithubUser githubUser = JSON.parseObject(string, GithubUser.class);//将JSON样式的string转换为java的类
            return githubUser;
        } catch (IOException e) {
        }
        return null;
    }
}
