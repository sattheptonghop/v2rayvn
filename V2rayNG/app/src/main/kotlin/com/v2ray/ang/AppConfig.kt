package com.v2ray.ang

/**
 *
 * App Config Const
 */
object AppConfig {
    const val ANG_PACKAGE = "com.v2ray.ang"
    const val DIR_ASSETS = "assets"

    // legacy
    const val ANG_CONFIG = "ang_config"
    const val PREF_INAPP_BUY_IS_PREMIUM = "pref_inapp_buy_is_premium"
    const val PREF_ROUTING_CUSTOM = "pref_routing_custom"

    // Preferences mapped to MMKV
    const val PREF_MODE = "pref_mode"
    const val PREF_SPEED_ENABLED = "pref_speed_enabled"
    const val PREF_SNIFFING_ENABLED = "pref_sniffing_enabled"
    const val PREF_MUX_ENABLED = "pref_mux_enabled"
    const val PREF_MUX_CONCURRENCY = "pref_mux_concurrency"
    const val PREF_PROXY_SHARING = "pref_proxy_sharing_enabled"
    const val PREF_LOCAL_DNS_ENABLED = "pref_local_dns_enabled"
    const val PREF_FAKE_DNS_ENABLED = "pref_fake_dns_enabled"
    const val PREF_VPN_DNS = "pref_vpn_dns"
    const val PREF_REMOTE_DNS = "pref_remote_dns"
    const val PREF_DOMESTIC_DNS = "pref_domestic_dns"
    const val PREF_LOCAL_DNS_PORT = "pref_local_dns_port"
    const val PREF_ALLOW_INSECURE = "pref_allow_insecure"
    const val PREF_SOCKS_PORT = "pref_socks_port"
    const val PREF_HTTP_PORT = "pref_http_port"
    const val PREF_LOGLEVEL = "pref_core_loglevel"
    const val PREF_LANGUAGE = "pref_language"
    const val PREF_PREFER_IPV6 = "pref_prefer_ipv6"
    const val PREF_ROUTING_DOMAIN_STRATEGY = "pref_routing_domain_strategy"
    const val PREF_ROUTING_MODE = "pref_routing_mode"
    const val PREF_V2RAY_ROUTING_AGENT = "pref_v2ray_routing_agent"
    const val PREF_V2RAY_ROUTING_DIRECT = "pref_v2ray_routing_direct"
    const val PREF_V2RAY_ROUTING_BLOCKED = "pref_v2ray_routing_blocked"
    const val PREF_PER_APP_PROXY = "pref_per_app_proxy"
    const val PREF_PER_APP_PROXY_SET = "pref_per_app_proxy_set"
    const val PREF_START_SCAN_IMMEDIATE = "pref_start_scan_immediate"
    const val PREF_BYPASS_APPS = "pref_bypass_apps"
    const val PREF_CONFIRM_REMOVE = "pref_confirm_remove"

    const val HTTP_PROTOCOL: String = "http://"
    const val HTTPS_PROTOCOL: String = "https://"

    const val BROADCAST_ACTION_SERVICE = "com.v2ray.ang.action.service"
    const val BROADCAST_ACTION_ACTIVITY = "com.v2ray.ang.action.activity"
    const val BROADCAST_ACTION_WIDGET_CLICK = "com.v2ray.ang.action.widget.click"

    const val TASKER_EXTRA_BUNDLE = "com.twofortyfouram.locale.intent.extra.BUNDLE"
    const val TASKER_EXTRA_STRING_BLURB = "com.twofortyfouram.locale.intent.extra.BLURB"
    const val TASKER_EXTRA_BUNDLE_SWITCH = "tasker_extra_bundle_switch"
    const val TASKER_EXTRA_BUNDLE_GUID = "tasker_extra_bundle_guid"
    const val TASKER_DEFAULT_GUID = "Default"

    const val TAG_AGENT = "proxy"
    const val TAG_DIRECT = "direct"
    const val TAG_BLOCKED = "block"

    const val androidpackagenamelistUrl = "https://raw.githubusercontent.com/2dust/androidpackagenamelist/master/proxy.txt"
    const val v2rayCustomRoutingListUrl = "https://raw.githubusercontent.com/2dust/v2rayCustomRoutingList/master/"
    const val v2rayNGIssues = "https://github.com/cuynu/v2rayvn/issues"
    const val v2rayNGWikiMode = "https://github.com/cuynu/v2rayvn/wiki/V%E1%BA%A5n-%C4%91%E1%BB%81-th%C6%B0%E1%BB%9Dng-g%E1%BA%B7p-tr%C3%AAn-v2rayNG"
    const val geoUrl = "https://github.com/Loyalsoldier/v2ray-rules-dat/releases/latest/download/";

    const val DNS_AGENT = "8.8.8.8"
    const val DNS_DIRECT = "223.5.5.5"

    const val PORT_LOCAL_DNS = "10853"
    const val PORT_SOCKS = "10808"
    const val PORT_HTTP = "10809"

    const val MUX_CONCURRENCY = "8"
    const val MSG_REGISTER_CLIENT = 1
    const val MSG_STATE_RUNNING = 11
    const val MSG_STATE_NOT_RUNNING = 12
    const val MSG_UNREGISTER_CLIENT = 2
    const val MSG_STATE_START = 3
    const val MSG_STATE_START_SUCCESS = 31
    const val MSG_STATE_START_FAILURE = 32
    const val MSG_STATE_STOP = 4
    const val MSG_STATE_STOP_SUCCESS = 41
    const val MSG_STATE_RESTART = 5
    const val MSG_MEASURE_DELAY = 6
    const val MSG_MEASURE_DELAY_SUCCESS = 61
    const val MSG_MEASURE_CONFIG = 7
    const val MSG_MEASURE_CONFIG_SUCCESS = 71
    const val MSG_MEASURE_CONFIG_CANCEL = 72
}
