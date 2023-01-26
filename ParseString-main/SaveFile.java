import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {
  String[] data;
  String path;

  public void save() {
    try (FileWriter fw = new FileWriter(new File(path), true)) {
      fw.write(this.toString() + "\n");

    } catch (RuntimeException | IOException e) {
      e.printStackTrace();

      // System.out.println(e.getClass().getSimpleName());
    }
  }

  public void setData(String[] data) {
    this.data = data;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < this.data.length; i++) {
      res.append("<" + data[i] + ">");
    }
    return res.toString();
  }
}
