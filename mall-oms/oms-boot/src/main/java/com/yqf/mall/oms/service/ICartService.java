package com.yqf.mall.oms.service;

import com.yqf.mall.oms.pojo.vo.CartVO;

import java.util.List;

/**
 * 购物车业务接口
 */
public interface ICartService {


    CartVO getCart();

    List<CartVO.CartItem> getCartItems(Long memberId);

    boolean deleteCart();

    boolean addCartItem(Long skuId);

    boolean updateCartItem(CartVO.CartItem cartItem);

    boolean removeCartItem(Long skuId);

    boolean removeCheckedItem();

    boolean checkAll(boolean checked);

}
