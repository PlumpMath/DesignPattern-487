package builder1;

/**
 * @author Quang Huy
 * Mẫu Builder cho phepsta tách việc tạo dựng đối tượng 
 * KHởi lớp ban đầu , để cho phép ta dễ dàng
 * tạo ra các đối tượng khác nhau
 */
public abstract class Builder {
	
	abstract public void builderStreet(String street);

	abstract public void builderCity(String city);

	abstract public void builderRegion(String region);
}
