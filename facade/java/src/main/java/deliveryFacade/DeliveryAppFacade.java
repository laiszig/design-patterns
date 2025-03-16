package deliveryFacade;

public class DeliveryAppFacade {

    private Restaurant restaurant;
    private DeliveryTeam deliveryTeam;
    private DeliveryBoy deliveryBoy;

    public DeliveryAppFacade() {
        this.restaurant = new Restaurant();
        this.deliveryTeam = new DeliveryTeam();
        this.deliveryBoy = new DeliveryBoy();
    }

    public void placeOrder(){
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickUpOrder();
        deliveryBoy.deliverOrder();
    }
}
