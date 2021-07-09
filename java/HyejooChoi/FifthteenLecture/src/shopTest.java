import java.util.ArrayList;

class Goods {
    public int goodsNo;
    public String gName;
    public int danga;

    public int getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(int goodsNo) {
        this.goodsNo = goodsNo;
    }

    public int getDanga() {
        return danga;
    }

    public Goods(int goodsNo, String gName, int danga) {
        this.goodsNo = goodsNo;
        this.gName = gName;
        this.danga = danga;
    }

    @Override
    public String toString() {
        return "Goods [상품번호=" + goodsNo + ", 상품명=" + gName + ", 단가="
                + danga + "]";
    }
}

class Cart {
    Goods goods;
    int count;
    int sum;

    public Goods getGoods() {
        return goods;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Cart(Goods goods, int count) {
// TODO Auto-generated constructor stub
        this.goods = goods;
        this.count = count;
        sum = count * goods.danga;
    }
    @Override
    public String toString() {
        return "Cart [Goods=" + goods + ", count=" + count + ", sum=" + sum
                + "]";
    }
}

public class shopTest{

    public static void main(String[] args) {
        Goods goods1 = new Goods(1001, "볼펜", 1000);
        Goods goods2 = new Goods(1002, "연필", 500);
        Goods goods3 = new Goods(1003, "딸기", 6000);

//장바구니에 담기
        ArrayList<Cart> carts = new ArrayList<Cart>();
        carts.add(new Cart(goods1, 2));
        carts.add(new Cart(goods2, 3));
        carts.add(new Cart(goods3, 2));

        for (int i = 0; i < carts.size(); i++) {
            System.out.println(carts.get(i).toString());
        }

        for (Cart c : carts) {
            if (c.getGoods().getGoodsNo() == 1001) {
                c.setCount(5);
                c.setSum(c.getCount() * c.getGoods().getDanga());
            }
        }
        System.out.println();
        System.out.println("----- 1001번 수량 5개로 변경 후-----");

        for (Cart c : carts) {
            System.out.println(c);
        }

        System.out.println();
        System.out.println("----- 장바구니에서 1002번 삭제-----");
        int i=0;
        for (Cart c : carts) {
            if (c.getGoods().getGoodsNo() == 1002) {
                carts.remove(i);
            }
            i++;
        }

        for (Cart c : carts) {
            System.out.println(c);
        }
    }
}