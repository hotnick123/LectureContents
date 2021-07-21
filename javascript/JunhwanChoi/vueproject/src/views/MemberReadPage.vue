<template>
    <div align="center">
        <br><br><br>
        <member-read-form v-if="member" :member="member"/>
        <p v-else>로딩중 ...... </p>
        <!--
        <router-link :to="{ name: 'BoardModifyPage', params: { boardNo } }">
            게시물 수정
        </router-link>
        <button @click="onDelete">삭제</button>
        -->
        <router-link :to="{ name: 'MemberListPage' }">
            회원정보 보기
        </router-link>
        <router-link :to="{ name: 'MemberModifyPage' }">
            비밀번호 변경
        </router-link>
    </div>
</template>

<script>
import MemberReadForm from '@/components/member/MemberReadForm.vue'
import { mapState, mapActions } from 'vuex'
import axios from 'axios'
export default {
    name: 'MemberReadPage',
    props: {
        memberNo: {
            type: String,
            required: true
        }
    },
    components: {
        MemberReadForm
    },
    computed: {
        ...mapState(['member'])
    },
    created () {
        this.fetchMember(this.memberNo)
                .catch(err => {
                    alert(err.response.data.message)
                    this.$router.push()
                })
    },
    methods: {
        ...mapActions(['fetchMember']),
        onDelete () {
            const { memberNo } = this.member
            axios.delete(`http://localhost:3647/project/${memberNo}`)
                    .then(() => {
                        alert('삭제 성공!')
                        this.$router.push({ name: 'MamberListPage' })
                    })
                    .catch(err => {
                        alert(err.response.data.message)
                    })
        }
    }
}
</script>