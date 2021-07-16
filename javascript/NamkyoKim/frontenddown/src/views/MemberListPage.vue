<template>
    <div id="member">
        <h2>회원가입</h2>
        <router-link :to="{ name: 'MemberRegisterPage' }">
            회원가입
        </router-link>
        <!-- <board-list/> -->
    </div>
</template>

<script>
// import { mapState, mapActions } from 'vuex'
export default {
    name: 'MemberListPage',
    components: {
    },
    computed: {
    }
}
</script> 