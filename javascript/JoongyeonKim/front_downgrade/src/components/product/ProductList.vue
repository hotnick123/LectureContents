<template>
    <div align="center">
        <h3>게시물 목록</h3>
        <table border="1">
            <tr>
                <th align="center" width="100">번호</th>
                <th align="center" width="240">상품이름</th>
                <th align="center" width="150">판매자</th>
                <th align="center" width="240">금액</th>
                <th align="center" width="640">상품내용</th>
            </tr>
            <tr v-if="!products || (Array.isArray(products) && products.length === 0)">
                <td colspan="4">
                현재 등록된 게시물이 없습니다!
                </td>
            </tr>
            <tr v-else v-for="product in products" :key="product.productNo">
                <td align="center">{{ product.productNo }}</td>
                <td align="left">
                    <router-link :to="{ name: 'BoardReadPage',
                                    params: { productNo: product.productNo.toString() } }">
                        {{ board.title }}
                    </router-link> 
                </td>
                <td align="right">{{ product.name }}</td>
                <td align="right">{{ product.writer }}</td>
                <td align="right">{{ product.price }}</td>
                 <td align="right">{{ product.description }}</td>
                <td align="center">{{ product.regDate }}</td>
            </tr>
        </table>
    </div>
</template>

<script>
export default {
    name: 'ProductList',
    props: {
        products: {
            type: Array
        }
    }
}
</script>