package jsf.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ImageBean implements Serializable{

    private List<Image> images = new ArrayList<>();

    @PostConstruct
    public void init() {
        images.add(new Image(1, false));
        images.add(new Image(2, true));
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

}
