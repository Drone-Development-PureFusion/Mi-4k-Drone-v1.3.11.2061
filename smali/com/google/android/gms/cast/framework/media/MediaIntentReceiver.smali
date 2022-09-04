.class public Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;
.super Landroid/content/BroadcastReceiver;


# static fields
.field public static final a:Ljava/lang/String; = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"

.field public static final b:Ljava/lang/String; = "com.google.android.gms.cast.framework.action.SKIP_NEXT"

.field public static final c:Ljava/lang/String; = "com.google.android.gms.cast.framework.action.SKIP_PREV"

.field public static final d:Ljava/lang/String; = "com.google.android.gms.cast.framework.action.FORWARD"

.field public static final e:Ljava/lang/String; = "com.google.android.gms.cast.framework.action.REWIND"

.field public static final f:Ljava/lang/String; = "com.google.android.gms.cast.framework.action.STOP_CASTING"

.field public static final g:Ljava/lang/String; = "com.google.android.gms.cast.framework.action.DISCONNECT"

.field public static final h:Ljava/lang/String; = "googlecast-extra_skip_step_ms"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->b(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->s()V

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/cast/framework/d;J)V
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->b(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->k()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->u()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->e()J

    move-result-wide v2

    add-long/2addr v2, p2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/cast/framework/media/c;->a(J)Lcom/google/android/gms/common/api/i;

    goto :goto_0
.end method

.method private b(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/d;->o()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/d;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/cast/framework/j;)V
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/cast/framework/d;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->a(Lcom/google/android/gms/cast/framework/d;)V

    :cond_0
    return-void
.end method

.method protected a(Lcom/google/android/gms/cast/framework/j;J)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/cast/framework/d;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->a(Lcom/google/android/gms/cast/framework/d;J)V

    :cond_0
    return-void
.end method

.method protected a(Lcom/google/android/gms/cast/framework/j;Landroid/content/Intent;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/cast/framework/d;

    if-eqz v0, :cond_0

    const-string v0, "android.intent.extra.KEY_EVENT"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.intent.extra.KEY_EVENT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/KeyEvent;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x55

    if-ne v0, v1, :cond_0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->a(Lcom/google/android/gms/cast/framework/d;)V

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method protected b(Lcom/google/android/gms/cast/framework/j;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/cast/framework/d;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->b(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->u()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/c;->e(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    goto :goto_0
.end method

.method protected b(Lcom/google/android/gms/cast/framework/j;J)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/cast/framework/d;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    neg-long v0, p2

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->a(Lcom/google/android/gms/cast/framework/d;J)V

    :cond_0
    return-void
.end method

.method protected c(Lcom/google/android/gms/cast/framework/j;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/cast/framework/d;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->b(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->u()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/c;->d(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    goto :goto_0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    const-wide/16 v6, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/c;->b()Lcom/google/android/gms/cast/framework/k;

    move-result-object v4

    const/4 v0, -0x1

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    :cond_1
    :goto_1
    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v3, p2}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->a(Ljava/lang/String;Landroid/content/Intent;)V

    goto :goto_0

    :sswitch_0
    const-string v5, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v0, v1

    goto :goto_1

    :sswitch_1
    const-string v5, "com.google.android.gms.cast.framework.action.SKIP_NEXT"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v0, v2

    goto :goto_1

    :sswitch_2
    const-string v5, "com.google.android.gms.cast.framework.action.SKIP_PREV"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v0, 0x2

    goto :goto_1

    :sswitch_3
    const-string v5, "com.google.android.gms.cast.framework.action.FORWARD"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_4
    const-string v5, "com.google.android.gms.cast.framework.action.REWIND"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :sswitch_5
    const-string v5, "com.google.android.gms.cast.framework.action.STOP_CASTING"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v0, 0x5

    goto :goto_1

    :sswitch_6
    const-string v5, "com.google.android.gms.cast.framework.action.DISCONNECT"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v0, 0x6

    goto :goto_1

    :sswitch_7
    const-string v5, "android.intent.action.MEDIA_BUTTON"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v0, 0x7

    goto :goto_1

    :pswitch_0
    invoke-virtual {v4}, Lcom/google/android/gms/cast/framework/k;->a()Lcom/google/android/gms/cast/framework/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->a(Lcom/google/android/gms/cast/framework/j;)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {v4}, Lcom/google/android/gms/cast/framework/k;->a()Lcom/google/android/gms/cast/framework/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->b(Lcom/google/android/gms/cast/framework/j;)V

    goto :goto_0

    :pswitch_2
    invoke-virtual {v4}, Lcom/google/android/gms/cast/framework/k;->a()Lcom/google/android/gms/cast/framework/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->c(Lcom/google/android/gms/cast/framework/j;)V

    goto :goto_0

    :pswitch_3
    const-string v0, "googlecast-extra_skip_step_ms"

    invoke-virtual {p2, v0, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/google/android/gms/cast/framework/k;->a()Lcom/google/android/gms/cast/framework/j;

    move-result-object v2

    invoke-virtual {p0, v2, v0, v1}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->a(Lcom/google/android/gms/cast/framework/j;J)V

    goto/16 :goto_0

    :pswitch_4
    const-string v0, "googlecast-extra_skip_step_ms"

    invoke-virtual {p2, v0, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/google/android/gms/cast/framework/k;->a()Lcom/google/android/gms/cast/framework/j;

    move-result-object v2

    invoke-virtual {p0, v2, v0, v1}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->b(Lcom/google/android/gms/cast/framework/j;J)V

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {v4, v2}, Lcom/google/android/gms/cast/framework/k;->a(Z)V

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {v4, v1}, Lcom/google/android/gms/cast/framework/k;->a(Z)V

    goto/16 :goto_0

    :pswitch_7
    invoke-virtual {v4}, Lcom/google/android/gms/cast/framework/k;->a()Lcom/google/android/gms/cast/framework/j;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;->a(Lcom/google/android/gms/cast/framework/j;Landroid/content/Intent;)V

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x655132e4 -> :sswitch_4
        -0x3855de4e -> :sswitch_1
        -0x3854c70e -> :sswitch_2
        -0x27d32f79 -> :sswitch_5
        -0x76b6783 -> :sswitch_6
        0xe0a3765 -> :sswitch_0
        0x51303e64 -> :sswitch_3
        0x7708a552 -> :sswitch_7
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method
