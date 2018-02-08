package com.yx.base.parameter;

import java.util.Arrays;
import java.util.List;

public class IMConstants {

	public final static List<Integer> SPEC_MSG_TYPE = Arrays.asList(2,3,4,16,17,18,28,29,30,32,33,34,35);
	
	public final static int DEV_PC = 3;
	public final static int DEV_IOS = 2;
	public final static int DEV_ANDROID = 1;

	// 聊天
	public final static String IM_EVENT_CHAT = "chat";

	// 心跳
	public final static String IM_EVENT_HEART = "heart";

	// 人对人
	public final static int MSG_FROM_P2P = 1;
	// 群聊
	public final static int MSG_FROM_GROUP = 2;
	// 系统消息
	public final static int MSG_FROM_SYS = 3;
	// 第三方
	public final static int MSG_FROM_THIRD = 4;

	//////////////////////////////////////////////////

	// READY
	public final static int MSG_TYPE_READY = 1;
	// 文本
	public final static int MSG_TYPE_TEXT = 2;

	public final static int MSG_TYPE_IMG = 3;
	// 文件
	public final static int MSG_TYPE_FILE = 4;

	public final static int MSG_TYPE_ONLINE = 5;

	public final static int MSG_TYPE_OFFLINE = 6;

	public final static int MSG_TYPE_DEL_FRIEND = 7;

	public final static int MSG_TYPE_JOIN_GROUP = 8;

	public final static int MSG_TYPE_QUIT_GROUP = 9;

	public final static int MSG_TYPE_INVITE_GROUP = 10;

	public final static int MSG_TYPE_FRIEND_REQ = 11;

	public final static int MSG_TYPE_ACCEPT_FRIEND = 12;

	public final static int MSG_TYPE_GROUP_REQ = 13;

	public final static int MSG_TYPE_ACCEPT_GROUP = 14;

	public final static int MSG_TYPE_OTHER_LOGIN = 15;

	public final static int MSG_TYPE_VOICE = 16;

	public final static int MSG_TYPE_RED_PACKET = 17;

	// 转账通知
	public final static int MSG_TYPE_TRANSFER = 18;

	// 有人接收红包时，，提示发红包人
	public final static int MSG_TYPE_RECEIVE_RED_NOTICE = 19;

	// 确认转账收钱通知
	public final static int MSG_TYPE_TRANSFER_REC = 20;

	// 退回转账通知
	public final static int MSG_TYPE_TRANSFER_BACK = 21;

	// 退回红包通知
	public final static int MSG_TYPE_REDPACKET_BACK = 22;

	// 自动添加好友成功
	public final static int MSG_TYPE_AUTO_FRIEND = 23;

	// 红包被光
	public final static int MSG_TYPE_RED_FINISHED = 24;

	// 修改群名通知
	public final static int MSG_TYPE_MODIFY_GROUP = 25;

	// 好友资料有修改
	public final static int MSG_TYPE_MODIFY_PROFILE = 26;

	// 群成员更新了备注名
	public final static int MSG_TYPE_MODIFY_GROUP_COMMENT = 27;

	/**
	 * 28 发送名片 29 发送位置(content:{url:http:xxxx,addr:详细地址 ,lat:经度, lut:纬度}) 30
	 * 发送小视频 ( content{img:http, time:2, video:http}) 31 心跳 32 消息撤回 33 消息已读 34
	 * 表情云 35 at类型的消息,目前@的消息只能是文本类型，content={atIds="11,22,33",content="文本或者表情"}
	 * 36 有好友发布了朋友圈动态 37 好友评论了你的动态，或者回复了你的评论
	 * 
	 */

	// 发送名片
	public final static int MSG_TYPE_SEND_CARD = 28;

	// 发送位置
	public final static int MSG_TYPE_SEND_LOCATION = 29;
	// 发送小视频
	public final static int MSG_TYPE_SEND_VIDEO = 30;

	// 心跳
	public final static int MSG_TYPE_HEARTBEAT = 31;
	// 消息撤回
	public final static int MSG_TYPE_REBACK = 32;
	// 消息已读
	public final static int MSG_TYPE_READED = 33;
	// 表情云
	public final static int MSG_TYPE_EMOJI_YUN = 34;
	// at类型的消息
	public final static int MSG_TYPE_AT = 35;
	// 有好友发布了朋友圈动态
	public final static int MSG_TYPE_NEW_FEED = 36;
	// 好友评论了你的动态，或者回复了你的评论
	public final static int MSG_TYPE_REFER_FEED = 37;
	// 好友赞了你的动态，或者回复了你的评论
	public final static int MSG_TYPE_REFER_PRAISE = 38;
	
	// 到账通知
	public final static int MSG_TYPE_REC_MONEY = 39;
	
	// AA收款消息
	public final static int MSG_TYPE_AA_RECEIVE = 40;
	
	//请求语音通话
	public final static int MSG_TYPE_VOICE_CHAT = 42;
	//请求视频通话
	public final static int MSG_TYPE_VIDEO_CHAT = 44;
	//阅后即焚
	public final static int MSG_TYPE_READ_DEL = 46;
	
	//有新闻公告信息
	public final static int MSG_TYPE_NEW_NOTICE=51;
	

}
