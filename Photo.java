
public class Photo{

  private String url;
  private String filename;
  private Float width;
  private Float height;
  
  public Photo(String url, String filename, Float width, Float height) {
      this.url = url;
      this.filename = filename;
      this.width = width;
      this.height = height;
  }
  
  public String getUrl() {return url;}
  public void setUrl(String url) {this.url = url;}
  
  public String getFilename() {return filename;}
  public void setFilename(String filename) {this.filename = filename;}
  
  public Float getWidth() {return width;}
  public void setWidth(Float width) {this.width = width;}
  
  public Float getHeight() {return height;}
  public void setHeight(Float height) {this.height = height;}
  
  }