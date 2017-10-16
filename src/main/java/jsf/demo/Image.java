package jsf.demo;

public class Image {

    private Integer id;
    private boolean showComments;

    public Image(Integer id, boolean showComments) {
        this.id = id;
        this.showComments = showComments;
    }

    public Image() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isShowComments() {
        System.out.println("***** isShowComments");
        return showComments;
    }

    public void setShowComments(boolean showComments) {
        System.out.println("***** setShowComments " + showComments);
        this.showComments = showComments;
    }
}
