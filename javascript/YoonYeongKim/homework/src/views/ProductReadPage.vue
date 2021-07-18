<template>
    <div align="center">
        <h2>Vue + Spring 상품 읽기</h2>
        <product-read v-if="product" :product="product"/>
        <p v-else>로딩중 ...... </p>
        <button @click="onDelete">삭제</button>
        <router-link :to="{ name: 'ProductListPage' }">
            상품 보기
        </router-link>
    </div>
</template>

<script>
import ProductRead from '@/components/product/ProductRead.vue'
import { mapState, mapActions } from 'vuex'
export default {
    name: 'ProductReadPage',
    props: {
        productNo: {
            type: String,
            required: true
        }
    },
    components: {
        ProductRead
    },
    computed: {
        ...mapState(['product'])
    },
    created () {
        this.fetchProduct(this.productNo)
                .catch(err => {
                    alert(err.response.data.message)
                    this.$router.push()
                })
    },
    methods: {
        ...mapActions(['fetchProduct']),
        onDelete () {
        }
    }
}
</script> 