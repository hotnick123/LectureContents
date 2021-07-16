<template>
    <div align="center">
        <h2>회원정보입력</h2>
        <member-register-form @submit="onSubmit"/>
    </div>
</template>

<script>
import MemberRegisterForm from '@/components/member/MemberRegisterForm.vue'
import axios from 'axios'
export default {
    name: 'MemberRegisterPage',
    components: {
        MemberRegisterForm
    },
    methods: {
        onSubmit (payload) {
            const { name, id, pw } = payload
            axios.post('http://localhost:8888/vuemember/register', { name, id, pw })
                    .then(res => {
                        alert('등록 성공! - ' + res)
                        /*
                        this.$router.push({
                            name: 'MemberReadPage',
                            params: { memberNo: res.data.memberNo.toString() }
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