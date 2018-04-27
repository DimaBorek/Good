package com.company;

import java.util.List;

public class Shop<G extends Good> {
    List<G> goods;

    public void add(G good){
        this.goods.add(good);

    }

    public List<G> getGoods() {
        return goods;
    }


    public void buy (Customer customer, Good good){
        if (customer.getMoney() >= good.getPrice());
      getGoods().remove(good);
      customer.getBag().add(good);




    }

    @Override
    public String toString() {
        return "Shop{" +
                "goods=" + goods +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop<?> shop = (Shop<?>) o;

        return goods != null ? goods.equals(shop.goods) : shop.goods == null;
    }

    @Override
    public int hashCode() {
        return goods != null ? goods.hashCode() : 0;
    }

    public void setGoods(List<G> goods) {
        this.goods = goods;
    }
}
