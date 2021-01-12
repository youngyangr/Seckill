package ss.pku.service;

import ss.pku.pojo.GoodsVo;
import ss.pku.pojo.OrderInfo;
import ss.pku.pojo.SeckillOrder;
import ss.pku.pojo.User;
import org.springframework.transaction.annotation.Transactional;

public interface OrderService {
    /**
     * 根据用户id和商品id查询订单
     * @param userId
     * @param goodsId
     * @return
     */
    public SeckillOrder getOrderByUserIdGoodsId(int userId, long goodsId);

    /**
     * 生成订单
     * @param user
     * @param goods
     * @return
     */
    @Transactional
    public OrderInfo createOrder(User user, GoodsVo goods);

    /**
     * 根据订单id获取订单
     * @param orderId
     * @return
     */
    public OrderInfo getByOrderId(long orderId);
}
