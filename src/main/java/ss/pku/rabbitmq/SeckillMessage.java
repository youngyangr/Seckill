package ss.pku.rabbitmq;

import ss.pku.pojo.User;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: SeckillProject
 * @description: 秒杀消息封装
 * @author: Mr.Li
 * @create: 2020-06-03 09:52
 **/
@Getter
@Setter
public class SeckillMessage {
    private User user;
    private long goodsId;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }
}
