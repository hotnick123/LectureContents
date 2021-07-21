import {
    FETCH_MEMBER_LIST,
    FETCH_MEMBER
} from './mutation-types'

import axios from 'axios'

export default {

    fetchMemberList ({ commit }) {
        return axios.get('http://localhost:3647/project/lists')
                .then((res) => {
                    commit(FETCH_MEMBER_LIST, res.data)
                })
    },
    fetchMember ({ commit }, memberNo) {
        return axios.get(`http://localhost:3647/project/${memberNo}`)
                .then((res) => {
                    commit(FETCH_MEMBER, res.data)
                })
    }
}