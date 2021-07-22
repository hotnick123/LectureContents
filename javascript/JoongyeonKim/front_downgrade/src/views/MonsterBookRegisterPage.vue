<template>
    <div align="center">
        <h2>상품 등록</h2>
        <monster-book-register-form @submit="onSubmit"/>
    </div>
</template>

<script>
import MonsterBookRegisterform from '@/components/monster/MonsterBookRegisterform.vue'
import axios from 'axios'
export default {
    name: 'MonsterBookRegisterPage',
    components: {
        MonsterBookRegisterform
    },
    methods: {
        onSubmit (payload) {
            const { name, hp, atk } = payload
            axios.post('http://localhost:7777/vuemonster/register', { name, hp, atk })
                    .then(res => {
                        alert('등록 성공! - ' + res)
                        
                        this.$router.push({
                            name: 'MonsterBookListPage',
                        })
                    })
                    .catch(res => {
                        alert(res.response.data.message)
                    })
        }
    }
}
</script>
