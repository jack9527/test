package com.yx.base.parameter;

public class RedisKey {

	public static String userObjKey;

	public static byte[] getImUserKey(long userId) {
		if (userId > 0) {
			byte[] key = ("userObj_" + userId).getBytes();
			return key;
		}
		return null;
	}
	
	/*public static byte[] getGroupMemberKey(long groupId){
		String key="user_groupmember_"+groupId;
		return key.getBytes();		
	}
	
	public static byte[] getFriendsKey(long userId){
		String friendKey="user_friend_"+userId;
		return friendKey.getBytes();		
	}
	
	public static byte[] getGroupsKey(long userId){
		String groupKey="user_group_"+userId;
		return groupKey.getBytes();
	}
	
	public static byte[] getTopKey(long userId){
		String topKey="user_top_"+userId;
		return topKey.getBytes();
	}
	
	public static byte[] getPayKey(long userId){
		String payKey="user_pay_"+userId;
		return payKey.getBytes();
	}
	*/
	
}
