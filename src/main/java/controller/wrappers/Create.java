package controller.wrappers;

import model.*;

public interface Create {
    Clients createClients(int children, String name);
    Bookings createBookings(int b_client_id, int b_room_id);
    Payments createPayments(int p_client_id, String payment_method);
    Rooms createRooms(int r_client_id, int room_price);
    Services createServices(int s_client_id, String service_type, int service_price);
}
