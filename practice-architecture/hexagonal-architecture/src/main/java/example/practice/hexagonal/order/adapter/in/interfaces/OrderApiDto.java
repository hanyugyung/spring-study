package example.practice.hexagonal.order.adapter.in.interfaces;

import example.practice.hexagonal.order.application.port.in.OrderDto;

public class OrderApiDto {

    public static class CreateOrderRequest {

        // TODO 요청 값

        /**
         * api request dto -> service dto parameter
         *
         * @return
         */
        public OrderDto.CreateOrderParameter to() {
            return new OrderDto.CreateOrderParameter();
        }
    }

    public static class CreateOrderResponse {

        // TODO 응답 값

        /**
         * service dto return -> api response dto
         *
         * @param orderReturn
         * @return
         */
        public static OrderApiDto.CreateOrderResponse from(OrderDto.CreateOrderReturn orderReturn) {
            return new OrderApiDto.CreateOrderResponse();
        }
    }
}