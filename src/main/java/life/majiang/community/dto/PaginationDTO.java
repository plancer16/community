package life.majiang.community.dto;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * @author plancer16
 * @create 2020-01-19 13:07
 */
@Data
public class PaginationDTO<T>{
    private List<T> data;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;//当前页
    private List<Integer> pages=new ArrayList<>();//页表列表展示的页
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage=totalPage;
        this.page=page;

        pages.add(page);//将当前页加入page列表
        for (int i=1;i<=3;i++){//当当前页的前三页和后三页放入列表
            if (page - i>0){
                pages.add(0,page - i);
            }
            if (page + i<= totalPage){
                pages.add(page + i);
            }
        }

        //显示上一页？
        if(page==1){
            showPrevious=false;
        }else {
            showPrevious=true;
        }

        //显示下一页？
        if(page==totalPage){
            showNext=false;
        }else {
            showNext=true;
        }

        //显示首页？
        if (pages.contains(1)){
            showFirstPage=false;
        }else {
            showFirstPage=true;
        }

        //显示尾页？
        if (pages.contains(totalPage)){
            showEndPage=false;
        }else {
            showEndPage=true;
        }
    }
}
