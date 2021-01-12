package ss.pku.controller;

import ss.pku.pojo.GoodsVo;
import ss.pku.pojo.OrderDetail;
import ss.pku.pojo.OrderInfo;
import ss.pku.pojo.User;
import ss.pku.result.CodeMsg;
import ss.pku.result.Result;
import ss.pku.service.GoodsService;
import ss.pku.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: SeckillProject
 * @description: 订单表现层
 * @author: Mr.Li
 * @create: 2020-06-02 11:18
 **/
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/detail")
    @ResponseBody
    public Result<OrderDetail> info(User user, @RequestParam("orderId") long orderId) {
        if (user == null) {
            return Result.error(CodeMsg.SESSION_ERROR);
        }
        OrderInfo orderInfo = orderService.getByOrderId(orderId);
        if(orderInfo == null) {
            return Result.error(CodeMsg.ORDER_NOT_EXIST);
        }

        long goodsId = orderInfo.getGoodsId();
        GoodsVo goods = goodsService.getGoodsVoById(goodsId);

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrder(orderInfo);
        orderDetail.setGoods(goods);
        return Result.success(orderDetail);
    }
}
