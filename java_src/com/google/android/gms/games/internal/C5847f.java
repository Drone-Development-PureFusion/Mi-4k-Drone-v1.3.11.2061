package com.google.android.gms.games.internal;

import com.facebook.common.util.UriUtil;
import com.tencent.open.GameAppOperation;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.market.sdk.C10447l;
/* renamed from: com.google.android.gms.games.internal.f */
/* loaded from: classes2.dex */
public final class C5847f {

    /* renamed from: com.google.android.gms.games.internal.f$a */
    /* loaded from: classes2.dex */
    public interface AbstractC5848a {

        /* renamed from: a */
        public static final String[] f20005a = {"account_name", "account_type", "external_player_id", "match_sync_token", "last_package_scan_timestamp", "quest_sync_token", "quest_sync_metadata_token", "request_sync_token", "xp_sync_token", "cover_photo_image_id", "cover_photo_image_uri", "cover_photo_image_url", "legacy_external_player_id", "social_invite_sync_token"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$aa */
    /* loaded from: classes2.dex */
    public interface AbstractC5849aa {

        /* renamed from: a */
        public static final String[] f20006a = {"instance_id", "page_type", "player_id", "default_display_name", "default_display_image_id", "default_display_image_uri", "default_display_image_url", "rank", "display_rank", "raw_score", "display_score", "achieved_timestamp", "score_tag"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$ab */
    /* loaded from: classes2.dex */
    public interface AbstractC5850ab {

        /* renamed from: a */
        public static final String[] f20007a = {"game_id", "external_leaderboard_id", "name", "board_icon_image_id", "board_icon_image_uri", "board_icon_image_url", "sorting_rank", "score_order"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$ac */
    /* loaded from: classes2.dex */
    public interface AbstractC5851ac {

        /* renamed from: a */
        public static final String[] f20008a = {"game_id", "external_match_id", "creator_external", "creation_timestamp", "last_updater_external", "last_updated_timestamp", "pending_participant_external", UriUtil.DATA_SCHEME, "status", "description", "version", "variant", "notification_text", "user_match_status", "has_automatch_criteria", "automatch_min_players", "automatch_max_players", "automatch_bit_mask", "automatch_wait_estimate_sec", "rematch_id", "match_number", "previous_match_data", "upsync_required", "description_participant_id"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$ad */
    /* loaded from: classes2.dex */
    public interface AbstractC5852ad {

        /* renamed from: a */
        public static final String[] f20009a = {"client_context_id", "type", "external_game_id", "external_match_id", "pending_participant_id", "version", "is_turn", "results"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$ae */
    /* loaded from: classes2.dex */
    public interface AbstractC5853ae {

        /* renamed from: a */
        public static final String[] f20010a = {"completion_reward_data", "event_instance_id", "external_milestone_id", "initial_value", "quest_id", "milestones_sorting_rank", "milestone_state", "target_value"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$af */
    /* loaded from: classes2.dex */
    public interface AbstractC5854af {

        /* renamed from: a */
        public static final String[] f20011a = {"notification_id", "game_id", "external_sub_id", "type", "image_id", "ticker", "title", "text", "coalesced_text", "timestamp", "acknowledged", "alert_level"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$ag */
    /* loaded from: classes2.dex */
    public interface AbstractC5855ag {
    }

    /* renamed from: com.google.android.gms.games.internal.f$ah */
    /* loaded from: classes2.dex */
    public interface AbstractC5856ah {

        /* renamed from: a */
        public static final String[] f20012a = {"match_id", "invitation_id", "external_participant_id", "player_id", "default_display_image_id", "default_display_image_url", "default_display_hi_res_image_id", "default_display_hi_res_image_url", "default_display_name", "player_status", "client_address", "result_type", "placing", "connected", "capabilities"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$ai */
    /* loaded from: classes2.dex */
    public interface AbstractC5857ai {

        /* renamed from: a */
        public static final String[] f20013a = {"level_value", "level_min_xp", "level_max_xp", "version"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$aj */
    /* loaded from: classes2.dex */
    public interface AbstractC5858aj {

        /* renamed from: a */
        public static final String[] f20014a = {"ave_session_length_minutes", "churn_probability", "days_since_last_played", "game_id", "num_purchases", "num_sessions", "num_sessions_percentile", "player_id", "unknown_raw_keys", "unknown_raw_values", "spend_percentile", "spend_probability", "high_spender_probability", "total_spend_next_28_days"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$ak */
    /* loaded from: classes2.dex */
    public interface AbstractC5859ak {

        /* renamed from: a */
        public static final String[] f20015a = {"external_player_id", "profile_icon_image_id", "profile_hi_res_image_id", "profile_icon_image_uri", "profile_icon_image_url", "profile_hi_res_image_uri", "profile_hi_res_image_url", "profile_name", "last_updated", "is_in_circles", "has_all_public_acls", "has_debug_access", "is_profile_visible", "current_xp_total", "current_level", "current_level_min_xp", "current_level_max_xp", "next_level", "next_level_max_xp", "last_level_up_timestamp", "player_title", "most_recent_external_game_id", "most_recent_game_name", "most_recent_activity_timestamp", "most_recent_game_icon_id", "most_recent_game_icon_uri", "most_recent_game_hi_res_id", "most_recent_game_hi_res_uri", "most_recent_game_featured_id", "most_recent_game_featured_uri", "gamer_tag", "real_name", "banner_image_landscape_id", "banner_image_landscape_uri", "banner_image_landscape_url", "banner_image_portrait_id", "banner_image_portrait_uri", "banner_image_portrait_url", "gamer_friend_status", "gamer_friend_update_timestamp", "is_muted"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$al */
    /* loaded from: classes2.dex */
    public interface AbstractC5860al {

        /* renamed from: a */
        public static final String[] f20016a = {"profile_visible", "profile_visibility_explicitly_set", "gamer_tag", "gamer_tag_explicitly_set", "gamer_tag_is_default", "stock_avatar_url", "stock_avatar_uri", "profile_discoverable", "auto_sign_in", "player_id"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$am */
    /* loaded from: classes2.dex */
    public interface AbstractC5861am {

        /* renamed from: a */
        public static final String[] f20017a = {"accepted_ts", "quest_banner_image_id", "quest_banner_image_uri", "quest_banner_image_url", "quest_description", "quest_end_ts", "external_quest_id", "game_id", "quest_icon_image_id", "quest_icon_image_uri", "quest_icon_image_url", "quest_last_updated_ts", "quest_name", "notified", "notification_ts", "quest_start_ts", "quest_state", "quest_type"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$an */
    /* loaded from: classes2.dex */
    public interface AbstractC5862an {

        /* renamed from: a */
        public static final String[] f20018a = {"client_context_id", "external_request_id", "external_game_id"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$ao */
    /* loaded from: classes2.dex */
    public interface AbstractC5863ao {

        /* renamed from: a */
        public static final String[] f20019a = {"request_id", "player_id", "recipient_status"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$ap */
    /* loaded from: classes2.dex */
    public interface AbstractC5864ap {

        /* renamed from: a */
        public static final String[] f20020a = {"wish_count", "gift_count", "player_count"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$aq */
    /* loaded from: classes2.dex */
    public interface AbstractC5865aq {

        /* renamed from: a */
        public static final String[] f20021a = {"external_request_id", "game_id", "sender_id", UriUtil.DATA_SCHEME, "type", "creation_timestamp", "expiration_timestamp", "status"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$ar */
    /* loaded from: classes2.dex */
    public interface AbstractC5866ar {

        /* renamed from: a */
        public static final String[] f20022a = {"game_id", "owner_id", "external_snapshot_id", "drive_resolved_id_string", "drive_resource_id_string", "cover_icon_image_id", "cover_icon_image_uri", "cover_icon_image_url", "cover_icon_image_width", "cover_icon_image_height", "title", "description", "last_modified_timestamp", "duration", "unique_name", "visible", "pending_change_count", "progress_value", "device_name"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$as */
    /* loaded from: classes2.dex */
    public interface AbstractC5867as {

        /* renamed from: a */
        public static final String[] f20023a = {"player_id", "external_social_invite_id", "type", "direction", "last_modified_timestamp"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$at */
    /* loaded from: classes2.dex */
    public interface AbstractC5868at {

        /* renamed from: a */
        public static final String[] f20024a = {"image_uri", GameAppOperation.QQFAV_DATALINE_IMAGEURL};
    }

    /* renamed from: com.google.android.gms.games.internal.f$au */
    /* loaded from: classes2.dex */
    public interface AbstractC5869au {

        /* renamed from: a */
        public static final String[] f20025a = {"status", "suggested_gamer_tags"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$av */
    /* loaded from: classes2.dex */
    public interface AbstractC5870av {

        /* renamed from: a */
        public static final String[] f20026a = {"duration", "filepath", "filesize", "package", "start_time"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$b */
    /* loaded from: classes2.dex */
    public interface AbstractC5871b {

        /* renamed from: a */
        public static final String[] f20027a = {"game_id", "external_achievement_id", "type", "name", "description", "unlocked_icon_image_id", "unlocked_icon_image_uri", "unlocked_icon_image_url", "revealed_icon_image_id", "revealed_icon_image_uri", "revealed_icon_image_url", "total_steps", "formatted_total_steps", "initial_state", "sorting_rank", "definition_xp_value"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$c */
    /* loaded from: classes2.dex */
    public interface AbstractC5872c {

        /* renamed from: a */
        public static final String[] f20028a = {"definition_id", "player_id", XiaomiOAuthConstants.EXTRA_STATE_2, "current_steps", "formatted_current_steps", "last_updated_timestamp", "instance_xp_value"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$d */
    /* loaded from: classes2.dex */
    public interface AbstractC5873d {

        /* renamed from: a */
        public static final String[] f20029a = {"client_context_id", "external_achievement_id", "achievement_type", "new_state", "steps_to_increment", "min_steps_to_set", "external_game_id", "external_player_id"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$e */
    /* loaded from: classes2.dex */
    public interface AbstractC5874e {

        /* renamed from: a */
        public static final String[] f20030a = {"specified_by_user", "pacl"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$f */
    /* loaded from: classes2.dex */
    public interface AbstractC5875f {

        /* renamed from: a */
        public static final String[] f20031a = {"action_id", "action_annotation", "action_conditions", "action_content_description", "action_data", "overflow_text", "action_type"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$g */
    /* loaded from: classes2.dex */
    public interface AbstractC5876g {

        /* renamed from: a */
        public static final String[] f20032a = {"annotation_id", "annotation_description", "annotation_image_default_id", "annotation_image_height", "annotation_image_uri", "annotation_image_width", "annotation_layout_slot", "annotation_modifiers", "annotation_title"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$h */
    /* loaded from: classes2.dex */
    public interface AbstractC5877h {

        /* renamed from: a */
        public static final String[] f20033a = {"card_actions", "card_annotations", "card_id", "card_conditions", "card_content_description", "card_current_steps", "card_data", "card_description", "card_subtitle", "card_title", "card_total_steps", "card_type"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$i */
    /* loaded from: classes2.dex */
    public interface AbstractC5878i {

        /* renamed from: a */
        public static final String[] f20034a = {"experiments", "json", "page_token", "screen_name", "server_cookie"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$j */
    /* loaded from: classes2.dex */
    public interface AbstractC5879j {

        /* renamed from: a */
        public static final String[] f20035a = {"condition_id", "condition_default_value", "condition_expected_value", "condition_predicate", "condition_predicate_parameters"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$k */
    /* loaded from: classes2.dex */
    public interface AbstractC5880k {

        /* renamed from: a */
        public static final String[] f20036a = {"section_actions", "section_annotations", "section_card_type", "section_content_description", "section_data", "section_description", "section_id", "section_subtitle", "section_title", "section_type"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$l */
    /* loaded from: classes2.dex */
    public interface AbstractC5881l {

        /* renamed from: a */
        public static final String[] f20037a = {"tuple_name", "tuple_id", "tuple_value"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$m */
    /* loaded from: classes2.dex */
    public interface AbstractC5882m {

        /* renamed from: a */
        public static final String[] f20038a = {"client_context_id", "end_time", "external_game_id", "session_id", "start_time", "ad_id", "limit_ad_tracking"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$n */
    /* loaded from: classes2.dex */
    public interface AbstractC5883n {

        /* renamed from: a */
        public static final String[] f20039a = {C10447l.PACKAGE_NAME, "package_uid", "account_name", "account_type", "is_games_lite"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$o */
    /* loaded from: classes2.dex */
    public interface AbstractC5884o {

        /* renamed from: a */
        public static final String[] f20040a = {"mobile_notifications_enabled", "loud_notifications_allowed", "match_notifications_enabled", "quest_notifications_enabled", "request_notifications_enabled", "level_notifications_enabled", "friend_notifications_enabled"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$p */
    /* loaded from: classes2.dex */
    public interface AbstractC5885p {

        /* renamed from: a */
        public static final String[] f20041a = {"event_definitions_game_id", "external_event_id", "name", "description", "visibility", "icon_image_id", "icon_image_uri", "icon_image_url", "sorting_rank"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$q */
    /* loaded from: classes2.dex */
    public interface AbstractC5886q {

        /* renamed from: a */
        public static final String[] f20042a = {"definition_id", "player_id", "formatted_value", "last_updated_timestamp"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$r */
    /* loaded from: classes2.dex */
    public interface AbstractC5887r {

        /* renamed from: a */
        public static final String[] f20043a = {"client_context_id", "instance_id", "window_start_time", "window_end_time", "increment", "request_id"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$s */
    /* loaded from: classes2.dex */
    public interface AbstractC5888s {

        /* renamed from: a */
        public static final String[] f20044a = {"external_experience_id", "game_id", "created_timestamp", "current_xp", "xp_earned", "display_title", "display_description", "display_string", "type", "icon_id", "icon_url", "icon_uri", "newLevel"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$t */
    /* loaded from: classes2.dex */
    public interface AbstractC5889t {

        /* renamed from: a */
        public static final String[] f20045a = {"badge_game_id", "badge_type", "badge_title", "badge_description", "badge_icon_image_id", "badge_icon_image_uri"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$u */
    /* loaded from: classes2.dex */
    public interface AbstractC5890u {

        /* renamed from: a */
        public static final String[] f20046a = {"instance_game_id", "real_time_support", "turn_based_support", "platform_type", "instance_display_name", C10447l.PACKAGE_NAME, "piracy_check", "installed", "preferred", "gamepad_support"};

        /* renamed from: b */
        public static final String[] f20047b = {"installed", C10447l.PACKAGE_NAME, "real_time_support", "turn_based_support", "gamepad_support"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$v */
    /* loaded from: classes2.dex */
    public interface AbstractC5891v {

        /* renamed from: a */
        public static final String[] f20048a = {"suggestion"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$w */
    /* loaded from: classes2.dex */
    public interface AbstractC5892w {

        /* renamed from: a */
        public static final String[] f20049a = {"external_game_id", "display_name", "primary_category", "secondary_category", "developer_name", "game_description", "game_icon_image_id", "game_icon_image_uri", "game_icon_image_url", "game_hi_res_image_id", "game_hi_res_image_uri", "game_hi_res_image_url", "featured_image_id", "featured_image_uri", "featured_image_url", "screenshot_image_ids", "video_url", "play_enabled_game", "last_played_server_time", "last_connection_local_time", "last_synced_local_time", "metadata_version", "sync_token", "target_instance", "gameplay_acl_status", "achievement_total_count", "leaderboard_count", "muted", "identity_sharing_confirmed", "snapshots_enabled", "theme_color"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$x */
    /* loaded from: classes2.dex */
    public interface AbstractC5893x {

        /* renamed from: a */
        public static final String[] f20050a = {"url", "local", "filesize", "download_timestamp"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$y */
    /* loaded from: classes2.dex */
    public interface AbstractC5894y {

        /* renamed from: a */
        public static final String[] f20051a = {"game_id", "external_invitation_id", "external_inviter_id", "creation_timestamp", "last_modified_timestamp", "description", "type", "variant", "has_automatch_criteria", "automatch_min_players", "automatch_max_players", "inviter_in_circles"};
    }

    /* renamed from: com.google.android.gms.games.internal.f$z */
    /* loaded from: classes2.dex */
    public interface AbstractC5895z {

        /* renamed from: a */
        public static final String[] f20052a = {"leaderboard_id", "timespan", "collection", "player_raw_score", "player_display_score", "player_rank", "player_display_rank", "player_score_tag", "total_scores", "top_page_token_next", "window_page_token_prev", "window_page_token_next"};
    }
}
