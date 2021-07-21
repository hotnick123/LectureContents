<template>
    <div>
        
        <center>
            <h3>회원 목록</h3><br><br><br>
        <table border="1" >
            <tr>
                <th align="center" width="100">회원번호</th>
                <th align="center" width="150">아이디</th>
                <th align="center" width="150">비밀번호</th>
                <th align="center" width="150">이름</th>
                <th align="center" width="150">생년월일</th>
                <th align="center" width="240">등록일자</th>
            </tr>
            <tr v-if="!members || (Array.isArray(members) && members.length === 0)">
                <td colspan="6">
                    현재 등록된 회원이 없습니다!
                </td>
            </tr>
            <tr v-else v-for="member in members" :key="member.memberNo">
                <td align="center">{{ member.memberNo }}</td>
                <td align="center">
                   <router-link :to="{ name: 'MemberReadPage',
                                    params: { memberNo: member.memberNo.toString() } }">
                        {{ member.id }}
                    </router-link>
                </td>
                <td align="center">{{ member.password }}</td>
                <td align="center">{{ member.username }}</td>
                <td align="center">{{ member.birth }}</td>
                <td align="center">{{ member.regDate }}</td>
            </tr>
        </table>
        </center>
    </div>
</template>

<script>
export default {
    name: 'MemberListForm',
    props: {
        members: {
            type: Array
        }
    }
}
</script>