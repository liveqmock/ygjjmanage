package com.sh.manage.demo.weixin.msg.req;

/**
 * 接收到的链接消息
 */
public final class LinkReqMsg extends BaseReqMsg {

	private String title;// 消息标题
	private String description;// 消息描述
	private String url;// 消息链接

	/**
	 * 得到消息标题
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 得到消息描述
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 得到消息链接
	 */
	public String getUrl() {
		return url;
	}

	public LinkReqMsg(String title, String description, String url) {
		super();
		this.title = title;
		this.description = description;
		this.url = url;
		setMsgType(ReqType.EVENT);
	}

	@Override
	public String toString() {
		return "LinkReqMsg [title=" + title + ", description=" + description
				+ ", url=" + url + ", toUserName=" + toUserName
				+ ", fromUserName=" + fromUserName + ", createTime="
				+ createTime + ", msgType=" + msgType + ", msgId=" + msgId
				+ "]";
	}

}
