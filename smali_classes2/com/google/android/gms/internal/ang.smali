.class public final Lcom/google/android/gms/internal/ang;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/nearby/connection/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ang$c;,
        Lcom/google/android/gms/internal/ang$b;,
        Lcom/google/android/gms/internal/ang$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/internal/anf;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/internal/anf;",
            "Lcom/google/android/gms/common/api/a$a$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ang;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/internal/ang$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ang$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ang;->b:Lcom/google/android/gms/common/api/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;
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

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ang;->b(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;
    .locals 2

    sget-object v0, Lcom/google/android/gms/nearby/a;->a:Lcom/google/android/gms/common/api/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a;)Z

    move-result v0

    const-string v1, "GoogleApiClient is not configured to use the Nearby Connections Api. Pass Nearby.CONNECTIONS_API into GoogleApiClient.Builder#addApi() to use this feature."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/nearby/a;->a:Lcom/google/android/gms/common/api/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/common/api/a;)Z

    move-result v0

    if-eqz p1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GoogleApiClient has an optional Nearby.CONNECTIONS_API and is not connected to Nearby Connections. Use GoogleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API) to guard this call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ang;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/anf;

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;JLcom/google/android/gms/nearby/connection/a$c;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "J",
            "Lcom/google/android/gms/nearby/connection/a$c;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p5}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v6

    new-instance v0, Lcom/google/android/gms/internal/ang$3;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ang$3;-><init>(Lcom/google/android/gms/internal/ang;Lcom/google/android/gms/common/api/g;Ljava/lang/String;JLcom/google/android/gms/internal/ail;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/nearby/connection/AppMetadata;JLcom/google/android/gms/nearby/connection/a$a;)Lcom/google/android/gms/common/api/i;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/nearby/connection/AppMetadata;",
            "J",
            "Lcom/google/android/gms/nearby/connection/a$a;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$e;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p6

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v10

    new-instance v3, Lcom/google/android/gms/internal/ang$2;

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-wide/from16 v8, p4

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/internal/ang$2;-><init>(Lcom/google/android/gms/internal/ang;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/nearby/connection/AppMetadata;JLcom/google/android/gms/internal/ail;)V

    invoke-virtual {p1, v3}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v2

    return-object v2
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/nearby/connection/a$b;Lcom/google/android/gms/nearby/connection/a$d;)Lcom/google/android/gms/common/api/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[B",
            "Lcom/google/android/gms/nearby/connection/a$b;",
            "Lcom/google/android/gms/nearby/connection/a$d;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p5}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v6

    invoke-virtual {p1, p6}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/internal/ang$4;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ang$4;-><init>(Lcom/google/android/gms/internal/ang;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;[BLcom/google/android/gms/nearby/connection/a$d;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "[B",
            "Lcom/google/android/gms/nearby/connection/a$d;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p4}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v5

    new-instance v0, Lcom/google/android/gms/internal/ang$5;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ang$5;-><init>(Lcom/google/android/gms/internal/ang;Lcom/google/android/gms/common/api/g;Ljava/lang/String;[BLcom/google/android/gms/internal/ail;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/anf;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/anf;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;[B)V
    .locals 3

    const/4 v2, 0x0

    invoke-static {p1, v2}, Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    aput-object p2, v1, v2

    invoke-virtual {v0, v1, p3}, Lcom/google/android/gms/internal/anf;->a([Ljava/lang/String;[B)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/util/List;[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;[B)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;

    move-result-object v1

    if-eqz v1, :cond_0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {v1, v0, p3}, Lcom/google/android/gms/internal/anf;->a([Ljava/lang/String;[B)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ang$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ang$6;-><init>(Lcom/google/android/gms/internal/ang;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/anf;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;[B)V
    .locals 3

    const/4 v2, 0x0

    invoke-static {p1, v2}, Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    aput-object p2, v1, v2

    invoke-virtual {v0, v1, p3}, Lcom/google/android/gms/internal/anf;->b([Ljava/lang/String;[B)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/common/api/g;Ljava/util/List;[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;[B)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;

    move-result-object v1

    if-eqz v1, :cond_0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {v1, v0, p3}, Lcom/google/android/gms/internal/anf;->b([Ljava/lang/String;[B)V

    :cond_0
    return-void
.end method

.method public c(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/anf;->j()V

    :cond_0
    return-void
.end method

.method public c(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/anf;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public d(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/internal/anf;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/anf;->k()V

    :cond_0
    return-void
.end method
