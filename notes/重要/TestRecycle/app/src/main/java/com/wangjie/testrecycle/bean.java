package com.wangjie.testrecycle;

/**
 * Created by Administrator on 2016/4/1.
 */
public class bean {

    /**
     * title : 窈窕新娘养成记
     * pic : http://up.boohee.cn/house/u/one/intro_story/yoyo.jpg
     * url : http://m.boohee.com/stories/yoyo?app_installed=true
     * width : 190
     * height : 260
     */

    private String title;
    private String pic;
    private String url;
    private int width;
    private int height;

    public bean(String title, String pic, String url, int width, int height) {
        this.title = title;
        this.pic = pic;
        this.url = url;
        this.width = width;
        this.height = height;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getTitle() {
        return title;
    }

    public String getPic() {
        return pic;
    }

    public String getUrl() {
        return url;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "bean{" +
                "title='" + title + '\'' +
                ", pic='" + pic + '\'' +
                ", url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
