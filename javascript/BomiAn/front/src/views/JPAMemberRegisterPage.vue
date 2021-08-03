<template>
    <div align="center">
        <h2>회원가입</h2>
        <jpa-member-register-form @submit="onMemberSubmit"/>
    </div>
</template>

<script>
import JpaMemberRegisterForm from '@/components/member/JpaMemberRegisterForm.vue'
import axios from 'axios'
export default {
    name: 'JPAMemberRegisterPage',
    components: {
        JpaMemberRegisterForm
    },
    methods: {
        onMemberSubmit (payload) {
            const { id, pw } = payload
            axios.post('http://localhost:7777/vuejpamember/register', { id, pw })
                    .then(res => {
                        alert('등록 성공! - ' + res)
                        /*
                        this.$router.push({
                            name: 'BoardReadPage',
                            params: { boardNo: res.data.boardNo.toString() }
                        })
                        */
                    })
                    .catch(res => {
                        alert(res.response.data.message)
                    })
        }
    }
}
</script>
