package application.view;

import javafx.beans.property.StringProperty;

public class RestaurantList {
	private StringProperty name;
	private StringProperty gate;
	private StringProperty price;
	private StringProperty menu;
	private StringProperty tel;
	
	public RestaurantList(StringProperty name, StringProperty gate, StringProperty price, StringProperty menu, StringProperty tel) {
		this.name = name;
		this.gate = gate;
		this.price = price;
		this.menu = menu;
		this.tel = tel;
	}

	public StringProperty nameProperty() {
		return name;
	}

	public StringProperty gateProperty() {
		return gate;
	}
	
	public StringProperty priceProperty() {
		return price;
	}
	
	public StringProperty menuProperty() {
		return menu;
	}

	public StringProperty telProperty() {
		return tel;
	}
}
