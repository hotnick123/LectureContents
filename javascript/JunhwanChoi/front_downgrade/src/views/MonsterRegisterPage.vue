<template>
    <div align="center">
        <h2>게시물 작성</h2>
        <monster-register-form @submit="onSubmit"/>
    </div>
</template>

<script>
import MonsterRegisterForm from '@/components/monster/MonsterRegisterForm.vue'
import axios from 'axios'
export default {
    name: 'MonsterRegisterPage',
    components: {
        MonsterRegisterForm
    },
    methods: {
        onSubmit (payload) {
            const { name, description, hp, exp, dropMoney, dropItem } = payload
            axios.post('http://localhost:7777/vuemonster/register', { name, description, hp, exp, dropMoney, dropItem })
                    .then(res => {
                        alert('등록 성공! - ' + res)
                        // console.log('게시물 번호: ' + res.data.monsterNo.toString())
                        this.$router.push({
                            name: 'MonsterListPage'
                            // params: { boardNo: res.data.boardNo.toString() }
                        })
                    })
                    .catch(res => {
                        alert(res.response.data.message)
                    })
        }
    }
}
</script>