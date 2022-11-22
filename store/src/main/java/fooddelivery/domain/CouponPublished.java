package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CouponPublished extends AbstractEvent {

    private Long id;
    private String cuponid;
    private String customerid;

    public CouponPublished(OrderMange aggregate){
        super(aggregate);
    }
    public CouponPublished(){
        super();
    }
}
