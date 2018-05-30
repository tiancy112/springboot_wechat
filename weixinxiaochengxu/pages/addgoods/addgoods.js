// pages/operation/operation.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    id: null,
    goodsName: '',
    goodsPrice: '',
    goodsDesc: '',
    addUrl: 'http://127.0.0.1:8099/addgoods',
    modifyUrl: 'http://127.0.0.1:8099/updategoods'
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    if (options.id == undefined) {
      return;
    }
    that.setData({
      id: options.id,
    });
    wx.request({
      url: 'http://127.0.0.1:8099/findById',
      data: { "id": options.id },
      method: 'GET',
      success: function (res) {
        var goods = res.data.goods;
        if (goods == undefined) {
          var text = '获取数据失败' + res.data.errMsg;
          wx.showToast({
            title: text,
            icon: '',
            duration: 2000
          });
        } else {
          that.setData({
            goodsName: goods.goodsName,
            goodsPrice: goods.goodsPrice,
            goodsDesc: goods.goodsDesc
          })
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },

  /**
   *  表单功能
   */
  formSubmit: function (e) {
    var that = this;
    var formData = e.detail.value; //获取表数据
    var url = that.data.addUrl;  //默认url
    if (that.data.id != undefined) {
      formData.id = that.data.id;
      url = that.data.modifyUrl;
    }
    wx.request({
      url: url,
      data: JSON.stringify(formData),
      method: 'POST',
      header: {
        'Content-Type': 'application/json'
      },
      success: function (res) {
        var result = res.data.success;
        var toastText = "操作成功";
        if (result != true) {
          toastText = "操作失败！" + res.data.errMsg;
        }
        wx.showToast({
          title: toastText,
          icon: '',
          duration: 3000
        });

        wx.redirectTo({
          url: '../index/index',
        })
        // if(that.data.areaId=undefined){
        //   wx.redirectTo({
        //     url: '../list/list',
        //   })
        // }
      }
    })
  }
})