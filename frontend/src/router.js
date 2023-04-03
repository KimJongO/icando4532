
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import FileUploadManager from "./components/listers/FileUploadCards"
import FileUploadDetail from "./components/listers/FileUploadDetail"

import FileindexerManager from "./components/listers/FileindexerCards"
import FileindexerDetail from "./components/listers/FileindexerDetail"

import VideoManager from "./components/listers/VideoCards"
import VideoDetail from "./components/listers/VideoDetail"




export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/fileUploads',
                name: 'FileUploadManager',
                component: FileUploadManager
            },
            {
                path: '/fileUploads/:id',
                name: 'FileUploadDetail',
                component: FileUploadDetail
            },

            {
                path: '/fileindexers',
                name: 'FileindexerManager',
                component: FileindexerManager
            },
            {
                path: '/fileindexers/:id',
                name: 'FileindexerDetail',
                component: FileindexerDetail
            },

            {
                path: '/videos',
                name: 'VideoManager',
                component: VideoManager
            },
            {
                path: '/videos/:id',
                name: 'VideoDetail',
                component: VideoDetail
            },





    ]
})
