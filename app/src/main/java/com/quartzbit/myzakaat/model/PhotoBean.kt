package `com`.quartzbit.myzakaat.model

import `com`.quartzbit.myzakaat.util.AppConstants

/**
 * Created by Jemsheer K D on 05 September, 2017.
 * Package `com`.quartzbit.myzakaat.model
 * Project Dearest
 */
class PhotoBean : BaseBean() {

    var id: String = ""
    var postID: String = ""
    var url: String = ""
    var time: Long = 0L
    var year: String = ""

    fun getMediaBean(): MediaBean {

        val mediaBean = MediaBean()
        mediaBean.id = id
        mediaBean.postID = postID
        mediaBean.time = time
//                    mediaBean.setImageThumbURL(App.getImagePath(getPhotoPath(snapshot, "snapshotURL")));
        mediaBean.imageThumbURL = url
//                    mediaBean.setImageURL(App.getImagePath(getPhotoPath(snapshot, "url")));
        mediaBean.imageURL = url
        mediaBean.videoURL = url
        mediaBean.type = AppConstants.MEDIA_TYPE_PHOTO

        return mediaBean
    }

}