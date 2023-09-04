package kitchenpos.fixture;

import java.util.UUID;
import kitchenpos.domain.OrderTable;

public class OrderTableFixture {

    private OrderTableFixture() {
    }

    public static OrderTable create() {
        OrderTable orderTable = new OrderTable();
        orderTable.setId(UUID.randomUUID());
        orderTable.setOccupied(true);
        orderTable.setNumberOfGuests(3);
        orderTable.setName("test 테이블");

        return orderTable;
    }

    public static OrderTable createEmpty() {
        return createEmpty("test 테이블");
    }

    public static OrderTable createOccupied(int numberOfGuests) {
        OrderTable orderTable = new OrderTable();
        orderTable.setId(UUID.randomUUID());
        orderTable.setOccupied(true);
        orderTable.setNumberOfGuests(numberOfGuests);
        orderTable.setName("test 테이블");

        return orderTable;
    }

    public static OrderTable createEmpty(String name) {
        OrderTable orderTable = new OrderTable();
        orderTable.setId(UUID.randomUUID());
        orderTable.setOccupied(false);
        orderTable.setNumberOfGuests(0);
        orderTable.setName(name);

        return orderTable;
    }
}
