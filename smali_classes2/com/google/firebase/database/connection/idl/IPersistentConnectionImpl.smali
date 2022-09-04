.class public Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;
.super Lcom/google/firebase/database/connection/idl/h$a;


# annotations
.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/hr;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/database/connection/idl/h$a;-><init>()V

    return-void
.end method

.method static synthetic a(Ljava/lang/Long;)J
    .locals 2

    invoke-static {p0}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->b(Ljava/lang/Long;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static a(Lcom/google/firebase/database/connection/idl/e;)Lcom/google/android/gms/internal/hm;
    .locals 1

    new-instance v0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$6;

    invoke-direct {v0, p0}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$6;-><init>(Lcom/google/firebase/database/connection/idl/e;)V

    return-object v0
.end method

.method private static a(Lcom/google/firebase/database/connection/idl/i;)Lcom/google/android/gms/internal/hr$a;
    .locals 1

    new-instance v0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$4;

    invoke-direct {v0, p0}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$4;-><init>(Lcom/google/firebase/database/connection/idl/i;)V

    return-object v0
.end method

.method private static a(Lcom/google/firebase/database/connection/idl/j;)Lcom/google/android/gms/internal/hu;
    .locals 1

    new-instance v0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$2;

    invoke-direct {v0, p0}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$2;-><init>(Lcom/google/firebase/database/connection/idl/j;)V

    return-object v0
.end method

.method private static a(Lcom/google/android/gms/internal/hm;)Lcom/google/firebase/database/connection/idl/e;
    .locals 1

    new-instance v0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;

    invoke-direct {v0, p0}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;-><init>(Lcom/google/android/gms/internal/hm;)V

    return-object v0
.end method

.method private static a(Lcom/google/android/gms/internal/hr$a;)Lcom/google/firebase/database/connection/idl/i;
    .locals 1

    new-instance v0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$3;

    invoke-direct {v0, p0}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$3;-><init>(Lcom/google/android/gms/internal/hr$a;)V

    return-object v0
.end method

.method static synthetic a(J)Ljava/lang/Long;
    .locals 2

    invoke-static {p0, p1}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->b(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/lang/Long;)J
    .locals 4

    const-wide/16 v0, -0x1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Tag parameter clashed with NO_TAG value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :cond_1
    return-wide v0
.end method

.method private static b(J)Ljava/lang/Long;
    .locals 2

    const-wide/16 v0, -0x1

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0
.end method

.method public static loadDynamic(Landroid/content/Context;Lcom/google/firebase/database/connection/idl/ConnectionConfig;Lcom/google/android/gms/internal/hm;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/hr$a;)Lcom/google/firebase/database/connection/idl/h;
    .locals 4

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/akb;->d:Lcom/google/android/gms/internal/akb$b;

    const-string v1, "com.google.android.gms.firebase_database"

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/akb;->a(Landroid/content/Context;Lcom/google/android/gms/internal/akb$b;Ljava/lang/String;)Lcom/google/android/gms/internal/akb;

    move-result-object v0

    const-string v1, "com.google.firebase.database.connection.idl.IPersistentConnectionImpl"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/akb;->a(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/database/connection/idl/h$a;->asInterface(Landroid/os/IBinder;)Lcom/google/firebase/database/connection/idl/h;

    move-result-object v0

    invoke-static {p2}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/android/gms/internal/hm;)Lcom/google/firebase/database/connection/idl/e;

    move-result-object v1

    invoke-static {p3}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-static {p4}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/android/gms/internal/hr$a;)Lcom/google/firebase/database/connection/idl/i;

    move-result-object v3

    invoke-interface {v0, p1, v1, v2, v3}, Lcom/google/firebase/database/connection/idl/h;->setup(Lcom/google/firebase/database/connection/idl/ConnectionConfig;Lcom/google/firebase/database/connection/idl/e;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/i;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/akb$a; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public compareAndPut(Ljava/util/List;Lcom/google/android/gms/c/e;Ljava/lang/String;Lcom/google/firebase/database/connection/idl/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Ljava/lang/String;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p4}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/firebase/database/connection/idl/j;)Lcom/google/android/gms/internal/hu;

    move-result-object v2

    invoke-interface {v0, p1, v1, p3, v2}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public initialize()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hr;->a()V

    return-void
.end method

.method public interrupt(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/hr;->d(Ljava/lang/String;)V

    return-void
.end method

.method public isInterrupted(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/hr;->f(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public listen(Ljava/util/List;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/g;JLcom/google/firebase/database/connection/idl/j;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Lcom/google/firebase/database/connection/idl/g;",
            "J",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation

    invoke-static {p4, p5}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->b(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    new-instance v3, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$1;

    invoke-direct {v3, p0, p3}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$1;-><init>(Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;Lcom/google/firebase/database/connection/idl/g;)V

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-static {p6}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/firebase/database/connection/idl/j;)Lcom/google/android/gms/internal/hu;

    move-result-object v5

    move-object v1, p1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/hq;Ljava/lang/Long;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public merge(Ljava/util/List;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {p3}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/firebase/database/connection/idl/j;)Lcom/google/android/gms/internal/hu;

    move-result-object v2

    invoke-interface {v1, p1, v0, v2}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public onDisconnectCancel(Ljava/util/List;Lcom/google/firebase/database/connection/idl/j;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-static {p2}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/firebase/database/connection/idl/j;)Lcom/google/android/gms/internal/hu;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public onDisconnectMerge(Ljava/util/List;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {p3}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/firebase/database/connection/idl/j;)Lcom/google/android/gms/internal/hu;

    move-result-object v2

    invoke-interface {v1, p1, v0, v2}, Lcom/google/android/gms/internal/hr;->b(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public onDisconnectPut(Ljava/util/List;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p3}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/firebase/database/connection/idl/j;)Lcom/google/android/gms/internal/hu;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/hr;->b(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public purgeOutstandingWrites()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hr;->d()V

    return-void
.end method

.method public put(Ljava/util/List;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            "Lcom/google/firebase/database/connection/idl/j;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p3}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/firebase/database/connection/idl/j;)Lcom/google/android/gms/internal/hu;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public refreshAuthToken()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hr;->c()V

    return-void
.end method

.method public refreshAuthToken2(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/hr;->c(Ljava/lang/String;)V

    return-void
.end method

.method public resume(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/hr;->e(Ljava/lang/String;)V

    return-void
.end method

.method public setup(Lcom/google/firebase/database/connection/idl/ConnectionConfig;Lcom/google/firebase/database/connection/idl/e;Lcom/google/android/gms/c/e;Lcom/google/firebase/database/connection/idl/i;)V
    .locals 9

    iget-object v0, p1, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->b:Lcom/google/firebase/database/connection/idl/HostInfoParcelable;

    invoke-static {v0}, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;->a(Lcom/google/firebase/database/connection/idl/HostInfoParcelable;)Lcom/google/android/gms/internal/hp;

    move-result-object v7

    invoke-static {p3}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p4}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/firebase/database/connection/idl/i;)Lcom/google/android/gms/internal/hr$a;

    move-result-object v8

    new-instance v1, Lcom/google/android/gms/internal/kq;

    invoke-virtual {p1}, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->a()Lcom/google/android/gms/internal/kt$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->b()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/kq;-><init>(Lcom/google/android/gms/internal/kt$a;Ljava/util/List;)V

    invoke-static {p2}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/firebase/database/connection/idl/e;)Lcom/google/android/gms/internal/hm;

    move-result-object v2

    new-instance v0, Lcom/google/android/gms/internal/hn;

    iget-boolean v4, p1, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->e:Z

    iget-object v5, p1, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->f:Ljava/lang/String;

    iget-object v6, p1, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->g:Ljava/lang/String;

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/hn;-><init>(Lcom/google/android/gms/internal/kt;Lcom/google/android/gms/internal/hm;Ljava/util/concurrent/ScheduledExecutorService;ZLjava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/hs;

    invoke-direct {v1, v0, v7, v8}, Lcom/google/android/gms/internal/hs;-><init>(Lcom/google/android/gms/internal/hn;Lcom/google/android/gms/internal/hp;Lcom/google/android/gms/internal/hr$a;)V

    iput-object v1, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    return-void
.end method

.method public shutdown()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hr;->b()V

    return-void
.end method

.method public unlisten(Ljava/util/List;Lcom/google/android/gms/c/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/c/e;",
            ")V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a:Lcom/google/android/gms/internal/hr;

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method
