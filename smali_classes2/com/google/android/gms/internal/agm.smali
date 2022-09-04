.class public Lcom/google/android/gms/internal/agm;
.super Lcom/google/android/gms/cast/internal/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/agm$a;,
        Lcom/google/android/gms/internal/agm$c;,
        Lcom/google/android/gms/internal/agm$b;,
        Lcom/google/android/gms/internal/agm$e;,
        Lcom/google/android/gms/internal/agm$d;
    }
.end annotation


# static fields
.field static final g:Ljava/lang/String;

.field private static final h:Lcom/google/android/gms/cast/internal/m;


# instance fields
.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/internal/q;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Landroid/content/SharedPreferences;

.field private final l:Ljava/lang/String;

.field private final m:Lcom/google/android/gms/cast/a$b;

.field private final n:Lcom/google/android/gms/common/api/g;

.field private o:Lcom/google/android/gms/internal/agn;

.field private p:Z

.field private q:Lcom/google/android/gms/cast/a/b;

.field private r:Lcom/google/android/gms/cast/a/b;

.field private s:Ljava/lang/String;

.field private t:Lorg/json/JSONObject;

.field private u:J

.field private v:Lcom/google/android/gms/cast/a/a$c;

.field private final w:Lcom/google/android/gms/common/util/e;

.field private x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "com.google.cast.games"

    invoke-static {v0}, Lcom/google/android/gms/cast/internal/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/agm;->g:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "GameManagerChannel"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/cast/a$b;)V
    .locals 8

    const/4 v4, 0x0

    const/4 v1, 0x0

    sget-object v0, Lcom/google/android/gms/internal/agm;->g:Ljava/lang/String;

    const-string v2, "CastGameManagerChannel"

    invoke-direct {p0, v0, v2, v4}, Lcom/google/android/gms/cast/internal/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->i:Ljava/util/Map;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/agm;->p:Z

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/gms/internal/agm;->u:J

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "castSessionId cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/cast/a;->k:Lcom/google/android/gms/common/api/a;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/common/api/a;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "googleApiClient needs to be connected and contain the Cast.API API."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/common/util/h;->d()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->w:Lcom/google/android/gms/common/util/e;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->j:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/gms/internal/agm;->l:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/agm;->m:Lcom/google/android/gms/cast/a$b;

    iput-object p1, p0, Lcom/google/android/gms/internal/agm;->n:Lcom/google/android/gms/common/api/g;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v3, "%s.%s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    const/4 v6, 0x1

    const-string v7, "game_manager_channel_data"

    aput-object v7, v5, v6

    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->k:Landroid/content/SharedPreferences;

    iput-object v4, p0, Lcom/google/android/gms/internal/agm;->r:Lcom/google/android/gms/cast/a/b;

    new-instance v0, Lcom/google/android/gms/internal/agq;

    const-string v3, ""

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const-string v6, ""

    const/4 v7, -0x1

    move v2, v1

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/agq;-><init>(IILjava/lang/String;Lorg/json/JSONObject;Ljava/util/Collection;Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->q:Lcom/google/android/gms/cast/a/b;

    return-void
.end method

.method private a(I)I
    .locals 4

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    sget-object v1, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x35

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown GameManager protocol status code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v0, 0xd

    :goto_0
    :pswitch_0
    return v0

    :pswitch_1
    const/16 v0, 0x867

    goto :goto_0

    :pswitch_2
    const/16 v0, 0x866

    goto :goto_0

    :pswitch_3
    const/16 v0, 0x7d3

    goto :goto_0

    :pswitch_4
    const/16 v0, 0x7d1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic a(Lcom/google/android/gms/internal/agm;)Lcom/google/android/gms/common/api/g;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->n:Lcom/google/android/gms/common/api/g;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/agm;Lcom/google/android/gms/internal/agn;)Lcom/google/android/gms/internal/agn;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agm;->o:Lcom/google/android/gms/internal/agn;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/agm;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agm;->x:Ljava/lang/String;

    return-object p1
.end method

.method private a(JLjava/lang/String;ILorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 5

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "requestId"

    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    invoke-virtual {v0, v1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "extraMessageData"

    invoke-virtual {v0, v1, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "playerId"

    invoke-virtual {v0, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "playerToken"

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/agm;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "JSONException when trying to create a message: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(JILjava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/q;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/cast/internal/q;->a(JILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/agm;Ljava/lang/String;ILorg/json/JSONObject;Lcom/google/android/gms/cast/internal/p;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/agm;->a(Ljava/lang/String;ILorg/json/JSONObject;Lcom/google/android/gms/cast/internal/p;)V

    return-void
.end method

.method private declared-synchronized a(Lcom/google/android/gms/internal/ago;)V
    .locals 8

    const/4 v0, 0x1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->a()I

    move-result v1

    if-ne v1, v0, :cond_2

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/agm;->q:Lcom/google/android/gms/cast/a/b;

    iput-object v1, p0, Lcom/google/android/gms/internal/agm;->r:Lcom/google/android/gms/cast/a/b;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->m()Lcom/google/android/gms/internal/agn;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->m()Lcom/google/android/gms/internal/agn;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->o:Lcom/google/android/gms/internal/agn;

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm;->h()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    :goto_1
    monitor-exit p0

    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    :try_start_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ags;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ags;->c()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/agr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ags;->a()I

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ags;->b()Lorg/json/JSONObject;

    move-result-object v0

    iget-object v6, p0, Lcom/google/android/gms/internal/agm;->i:Ljava/util/Map;

    invoke-interface {v6, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    invoke-direct {v3, v2, v4, v0, v6}, Lcom/google/android/gms/internal/agr;-><init>(Ljava/lang/String;ILorg/json/JSONObject;Z)V

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_4
    :try_start_2
    new-instance v0, Lcom/google/android/gms/internal/agq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->f()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->e()I

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->h()Lorg/json/JSONObject;

    move-result-object v4

    iget-object v6, p0, Lcom/google/android/gms/internal/agm;->o:Lcom/google/android/gms/internal/agn;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/agn;->a()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/google/android/gms/internal/agm;->o:Lcom/google/android/gms/internal/agn;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/agn;->b()I

    move-result v7

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/agq;-><init>(IILjava/lang/String;Lorg/json/JSONObject;Ljava/util/Collection;Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->q:Lcom/google/android/gms/cast/a/b;

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->q:Lcom/google/android/gms/cast/a/b;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/a/b;->a(Ljava/lang/String;)Lcom/google/android/gms/cast/a/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->a()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->s:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ago;->d()Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->t:Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_1
.end method

.method private a(Ljava/lang/String;ILorg/json/JSONObject;Lcom/google/android/gms/cast/internal/p;)V
    .locals 8

    iget-wide v0, p0, Lcom/google/android/gms/internal/agm;->u:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/google/android/gms/internal/agm;->u:J

    move-object v1, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/agm;->a(JLjava/lang/String;ILorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    const/16 v2, 0x7d1

    const/4 v3, 0x0

    invoke-interface {p4, v0, v1, v2, v3}, Lcom/google/android/gms/cast/internal/p;->a(JILjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "Not sending request because it was invalid."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/cast/internal/q;

    iget-object v4, p0, Lcom/google/android/gms/internal/agm;->w:Lcom/google/android/gms/common/util/e;

    const-wide/16 v6, 0x7530

    invoke-direct {v1, v4, v6, v7}, Lcom/google/android/gms/cast/internal/q;-><init>(Lcom/google/android/gms/common/util/e;J)V

    invoke-virtual {v1, v2, v3, p4}, Lcom/google/android/gms/cast/internal/q;->a(JLcom/google/android/gms/cast/internal/p;)V

    iget-object v4, p0, Lcom/google/android/gms/internal/agm;->j:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/agm;->a(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/agm;->m:Lcom/google/android/gms/cast/a$b;

    iget-object v4, p0, Lcom/google/android/gms/internal/agm;->n:Lcom/google/android/gms/common/api/g;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v4, v5, v0}, Lcom/google/android/gms/cast/a$b;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/agm$4;

    invoke-direct {v1, p0, v2, v3}, Lcom/google/android/gms/internal/agm$4;-><init>(Lcom/google/android/gms/internal/agm;J)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/n;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/agm;)Lcom/google/android/gms/cast/a$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->m:Lcom/google/android/gms/cast/a$b;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/agm;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/agm;->m()V

    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/internal/agm;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/agm;->l()V

    return-void
.end method

.method static synthetic i()Lcom/google/android/gms/cast/internal/m;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    return-object v0
.end method

.method private declared-synchronized j()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm;->h()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempted to perform an operation on the GameManagerChannel before it is initialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempted to perform an operation on the GameManagerChannel after it has been disposed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    monitor-exit p0

    return-void
.end method

.method private k()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->v:Lcom/google/android/gms/cast/a/a$c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->r:Lcom/google/android/gms/cast/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->q:Lcom/google/android/gms/cast/a/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/agm;->r:Lcom/google/android/gms/cast/a/b;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->v:Lcom/google/android/gms/cast/a/a$c;

    iget-object v1, p0, Lcom/google/android/gms/internal/agm;->q:Lcom/google/android/gms/cast/a/b;

    iget-object v2, p0, Lcom/google/android/gms/internal/agm;->r:Lcom/google/android/gms/cast/a/b;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/cast/a/a$c;->a(Lcom/google/android/gms/cast/a/b;Lcom/google/android/gms/cast/a/b;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->t:Lorg/json/JSONObject;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->s:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->v:Lcom/google/android/gms/cast/a/a$c;

    iget-object v1, p0, Lcom/google/android/gms/internal/agm;->s:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/agm;->t:Lorg/json/JSONObject;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/cast/a/a$c;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    iput-object v3, p0, Lcom/google/android/gms/internal/agm;->r:Lcom/google/android/gms/cast/a/b;

    iput-object v3, p0, Lcom/google/android/gms/internal/agm;->s:Ljava/lang/String;

    iput-object v3, p0, Lcom/google/android/gms/internal/agm;->t:Lorg/json/JSONObject;

    return-void
.end method

.method private declared-synchronized l()V
    .locals 5

    monitor-enter p0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "castSessionId"

    iget-object v2, p0, Lcom/google/android/gms/internal/agm;->l:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "playerTokenMap"

    new-instance v2, Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/google/android/gms/internal/agm;->i:Ljava/util/Map;

    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/internal/agm;->k:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "save_data"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_1
    sget-object v1, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Error while saving data: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized m()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->k:Landroid/content/SharedPreferences;

    const-string v1, "save_data"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "castSessionId"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/agm;->l:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "playerTokenMap"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/agm;->i:Ljava/util/Map;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    sget-object v1, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Error while loading data: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    const-wide/16 v0, 0x0

    :try_start_3
    iput-wide v0, p0, Lcom/google/android/gms/internal/agm;->u:J
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a(Lcom/google/android/gms/cast/a/a;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/a/a;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/a/a$a;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    if-nez p1, :cond_0

    :try_start_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "gameManagerClient can\'t be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->n:Lcom/google/android/gms/common/api/g;

    new-instance v1, Lcom/google/android/gms/internal/agm$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/agm$1;-><init>(Lcom/google/android/gms/internal/agm;Lcom/google/android/gms/cast/a/a;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0
.end method

.method public declared-synchronized a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/a/a$b;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/agm;->j()V

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->n:Lcom/google/android/gms/common/api/g;

    new-instance v1, Lcom/google/android/gms/internal/agm$2;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/google/android/gms/internal/agm$2;-><init>(Lcom/google/android/gms/internal/agm;ILjava/lang/String;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(JI)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/agm;->a(JILjava/lang/Object;)V

    return-void
.end method

.method public declared-synchronized a(Lcom/google/android/gms/cast/a/a$c;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/agm;->v:Lcom/google/android/gms/cast/a/a$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/agm;->j()V

    iget-wide v0, p0, Lcom/google/android/gms/internal/agm;->u:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/google/android/gms/internal/agm;->u:J

    const/4 v5, 0x7

    move-object v1, p0

    move-object v4, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/agm;->a(JLjava/lang/String;ILorg/json/JSONObject;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/agm;->m:Lcom/google/android/gms/cast/a$b;

    iget-object v2, p0, Lcom/google/android/gms/internal/agm;->n:Lcom/google/android/gms/common/api/g;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v3, v0}, Lcom/google/android/gms/cast/a$b;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected a(J)Z
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/q;

    const/16 v2, 0xf

    invoke-virtual {v0, p1, p2, v2}, Lcom/google/android/gms/cast/internal/q;->b(JI)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    sget-object v2, Lcom/google/android/gms/cast/internal/q;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/q;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/q;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    monitor-exit v2

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method public declared-synchronized b(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/a/a$b;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/agm;->j()V

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->n:Lcom/google/android/gms/common/api/g;

    new-instance v1, Lcom/google/android/gms/internal/agm$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/agm$3;-><init>(Lcom/google/android/gms/internal/agm;Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 7

    const/4 v2, 0x0

    const/4 v1, 0x1

    sget-object v0, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    const-string v3, "message received: %s"

    new-array v4, v1, [Ljava/lang/Object;

    aput-object p1, v4, v2

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ago;->a(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ago;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    if-nez v3, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    const-string v3, "Could not parse game manager message from string: %s"

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    sget-object v3, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    const-string v4, "Message is malformed (%s); ignoring: %s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v2

    aput-object p1, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm;->h()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ago;->m()Lcom/google/android/gms/internal/agn;

    move-result-object v0

    if-eqz v0, :cond_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm;->g()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ago;->a()I

    move-result v0

    if-ne v0, v1, :cond_5

    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ago;->l()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v4, p0, Lcom/google/android/gms/internal/agm;->i:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ago;->j()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ago;->l()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/android/gms/internal/agm;->l()V

    :cond_3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ago;->b()I

    move-result v4

    if-nez v4, :cond_6

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/agm;->a(Lcom/google/android/gms/internal/ago;)V

    :goto_2
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ago;->b()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/agm;->a(I)I

    move-result v1

    if-eqz v0, :cond_4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ago;->k()J

    move-result-wide v4

    invoke-direct {p0, v4, v5, v1, v3}, Lcom/google/android/gms/internal/agm;->a(JILjava/lang/Object;)V

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/agm;->k()V

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_1

    :cond_6
    sget-object v4, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    const-string v5, "Not updating from game message because the message contains error code: %d"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ago;->b()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v2

    invoke-virtual {v4, v5, v1}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2
.end method

.method public declared-synchronized c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    monitor-enter p0

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/agm;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->q:Lcom/google/android/gms/cast/a/b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->r:Lcom/google/android/gms/cast/a/b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->s:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/agm;->t:Lorg/json/JSONObject;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/agm;->p:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->m:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/internal/agm;->n:Lcom/google/android/gms/common/api/g;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/cast/a$b;->d(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_3
    sget-object v1, Lcom/google/android/gms/internal/agm;->h:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Exception while detaching game manager channel."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e()Lcom/google/android/gms/cast/a/b;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/agm;->j()V

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->q:Lcom/google/android/gms/cast/a/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized f()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/agm;->j()V

    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->x:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized g()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/agm;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized h()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agm;->o:Lcom/google/android/gms/internal/agn;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
