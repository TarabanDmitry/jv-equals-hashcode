package core.basesyntax;


/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */
public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object rect) {
        if (this == rect) {
            return true;
        }
        if (rect instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) rect;
            if (this.width.equals(rectangle.width)
                    && this.length.equals(rectangle.length)
                    && this.color.equals(rectangle.color)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return width.hashCode() * 31 + length.hashCode() * 31 + color.hashCode() * 31;
    }
}
