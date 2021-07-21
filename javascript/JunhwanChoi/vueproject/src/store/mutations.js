import { 
    FETCH_MEMBER_LIST,
    FETCH_MEMBER
} from './mutation-types'

export default {
    // 게시판
    [FETCH_MEMBER_LIST] (state, members) {
        state.members = members;
    },
    [FETCH_MEMBER] (state, member) {
        state.member = member
    }
}