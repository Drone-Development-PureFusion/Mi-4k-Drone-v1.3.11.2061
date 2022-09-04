.class public final Lcom/google/android/gms/games/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/c$h;,
        Lcom/google/android/gms/games/c$d;,
        Lcom/google/android/gms/games/c$f;,
        Lcom/google/android/gms/games/c$e;,
        Lcom/google/android/gms/games/c$g;,
        Lcom/google/android/gms/games/c$i;,
        Lcom/google/android/gms/games/c$a;,
        Lcom/google/android/gms/games/c$b;,
        Lcom/google/android/gms/games/c$c;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "players"

.field public static final b:Ljava/lang/String; = "status"

.field static final c:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/games/internal/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lcom/google/android/gms/common/api/Scope;

.field public static final e:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/games/c$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lcom/google/android/gms/common/api/Scope;

.field public static final g:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/games/c$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lcom/google/android/gms/games/e;

.field public static final i:Lcom/google/android/gms/games/achievement/c;

.field public static final j:Lcom/google/android/gms/games/appcontent/i;

.field public static final k:Lcom/google/android/gms/games/event/c;

.field public static final l:Lcom/google/android/gms/games/a/m;

.field public static final m:Lcom/google/android/gms/games/multiplayer/c;

.field public static final n:Lcom/google/android/gms/games/multiplayer/turnbased/g;

.field public static final o:Lcom/google/android/gms/games/multiplayer/realtime/b;

.field public static final p:Lcom/google/android/gms/games/multiplayer/d;

.field public static final q:Lcom/google/android/gms/games/n;

.field public static final r:Lcom/google/android/gms/games/g;

.field public static final s:Lcom/google/android/gms/games/quest/f;

.field public static final t:Lcom/google/android/gms/games/request/g;

.field public static final u:Lcom/google/android/gms/games/snapshot/g;

.field public static final v:Lcom/google/android/gms/games/stats/c;

.field public static final w:Lcom/google/android/gms/games/video/f;

.field public static final x:Lcom/google/android/gms/games/social/b;

.field private static final y:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/games/internal/d;",
            "Lcom/google/android/gms/games/c$c;",
            ">;"
        }
    .end annotation
.end field

.field private static final z:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/games/internal/d;",
            "Lcom/google/android/gms/games/c$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->c:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/games/c$1;

    invoke-direct {v0}, Lcom/google/android/gms/games/c$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->y:Lcom/google/android/gms/common/api/a$b;

    new-instance v0, Lcom/google/android/gms/games/c$2;

    invoke-direct {v0}, Lcom/google/android/gms/games/c$2;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->z:Lcom/google/android/gms/common/api/a$b;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/games"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/games/c;->d:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Games.API"

    sget-object v2, Lcom/google/android/gms/games/c;->y:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/games/c;->c:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/games/c;->e:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/games.firstparty"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/games/c;->f:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Games.API_1P"

    sget-object v2, Lcom/google/android/gms/games/c;->z:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/games/c;->c:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/games/c;->g:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/games/internal/a/d;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->h:Lcom/google/android/gms/games/e;

    new-instance v0, Lcom/google/android/gms/games/internal/a/a;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->i:Lcom/google/android/gms/games/achievement/c;

    new-instance v0, Lcom/google/android/gms/games/internal/a/b;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->j:Lcom/google/android/gms/games/appcontent/i;

    new-instance v0, Lcom/google/android/gms/games/internal/a/c;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/c;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->k:Lcom/google/android/gms/games/event/c;

    new-instance v0, Lcom/google/android/gms/games/internal/a/f;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/f;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->l:Lcom/google/android/gms/games/a/m;

    new-instance v0, Lcom/google/android/gms/games/internal/a/e;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/e;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->m:Lcom/google/android/gms/games/multiplayer/c;

    new-instance v0, Lcom/google/android/gms/games/internal/a/p;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/p;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->n:Lcom/google/android/gms/games/multiplayer/turnbased/g;

    new-instance v0, Lcom/google/android/gms/games/internal/a/k;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->o:Lcom/google/android/gms/games/multiplayer/realtime/b;

    new-instance v0, Lcom/google/android/gms/games/internal/a/g;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->p:Lcom/google/android/gms/games/multiplayer/d;

    new-instance v0, Lcom/google/android/gms/games/internal/a/i;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->q:Lcom/google/android/gms/games/n;

    new-instance v0, Lcom/google/android/gms/games/internal/a/h;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->r:Lcom/google/android/gms/games/g;

    new-instance v0, Lcom/google/android/gms/games/internal/a/j;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/j;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->s:Lcom/google/android/gms/games/quest/f;

    new-instance v0, Lcom/google/android/gms/games/internal/a/l;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/l;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->t:Lcom/google/android/gms/games/request/g;

    new-instance v0, Lcom/google/android/gms/games/internal/a/m;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/m;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->u:Lcom/google/android/gms/games/snapshot/g;

    new-instance v0, Lcom/google/android/gms/games/internal/a/o;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/o;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->v:Lcom/google/android/gms/games/stats/c;

    new-instance v0, Lcom/google/android/gms/games/internal/a/q;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/q;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->w:Lcom/google/android/gms/games/video/f;

    new-instance v0, Lcom/google/android/gms/games/internal/a/n;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/a/n;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/c;->x:Lcom/google/android/gms/games/social/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/c$e;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "Please provide a valid serverClientId"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/games/c$4;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/c$4;-><init>(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "GoogleApiClient parameter is required."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/g;->j()Z

    move-result v0

    const-string v1, "GoogleApiClient must be connected."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    invoke-static {p0, p1}, Lcom/google/android/gms/games/c;->b(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lcom/google/android/gms/common/api/g;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/games/internal/d;->c(I)V

    :cond_0
    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/g;Landroid/view/View;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/games/internal/d;->a(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public static b(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;
    .locals 2

    sget-object v0, Lcom/google/android/gms/games/c;->e:Lcom/google/android/gms/common/api/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a;)Z

    move-result v0

    const-string v1, "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/games/c;->e:Lcom/google/android/gms/common/api/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/common/api/a;)Z

    move-result v0

    if-eqz p1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/games/c;->c:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/d;

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Lcom/google/android/gms/common/api/g;)Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.GET_ACCOUNTS"
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lcom/google/android/gms/common/api/g;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->M()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Lcom/google/android/gms/common/api/g;)Landroid/content/Intent;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->K()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public static e(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/c$5;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/c$5;-><init>(Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public static f(Lcom/google/android/gms/common/api/g;)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->L()I

    move-result v0

    return v0
.end method
