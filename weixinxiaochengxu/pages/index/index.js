Page({
  data: {
    list: []
  },

  onLoad: function (options) {
    // 页面初始化 options为页面跳转所带来的参数

  },

   onShow: function () {
    var that = this;
    wx.request({
      url: 'http://127.0.0.1:8099/goodslist',
      method: 'GET',
      data: {},
      success: function (res) {
        var list = res.data.goodslist;
        if (list == null) {
          var toastText = '获取数据失败' + res.data.errMsg;
          wx.showToast({
            title: toastText,
            icon: '',
            duration: 2000 //弹出时间
          })
        } else {
          that.setData({
            list: list
          })
        }
      }
    })
  },
   addGoods: function () {
     wx.navigateTo({
       url: '../addgoods/addgoods'
     })
   },
   deletegoods: function (e) {
     var that = this;
console.log(e);
     wx.showModal({
       title: '提示',
       content: '确定要删除[' + e.target.dataset.goodsName + ']吗？',
       success: function (sm) {
         if (sm.confirm) {
           wx.request({
             url: 'http://127.0.0.1:8099/deletegoods',
             data: { 'id': e.target.dataset.id },
             method: 'DELETE',
             success: function (res) {
               var result = res.data.success;
               var toastText = "删除成功";
               if (result != true) {
                 toastText = "删除失败";
               } else {
                 that.data.list.splice(e.target.dataset.index, 1);
                 that.setData({
                   list: that.data.list
                 });
               }
               wx.showToast({
                 title: toastText,
                 icon: '',
                 duration: 2000
               });
             }
           })
         }
       }
     })


   }
})

