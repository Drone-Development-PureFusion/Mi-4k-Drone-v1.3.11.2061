.class public final Lcom/google/android/gms/cast/a/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/a/a$b;,
        Lcom/google/android/gms/cast/a/a$a;,
        Lcom/google/android/gms/cast/a/a$c;
    }
.end annotation


# static fields
.field public static final a:I = 0x866

.field public static final b:I = 0x867

.field public static final c:I = 0x0

.field public static final d:I = 0x1

.field public static final e:I = 0x2

.field public static final f:I = 0x3

.field public static final g:I = 0x4

.field public static final h:I = 0x5

.field public static final i:I = 0x6

.field public static final j:I = 0x0

.field public static final k:I = 0x1

.field public static final l:I = 0x2

.field public static final m:I = 0x0

.field public static final n:I = 0x1

.field public static final o:I = 0x2

.field public static final p:I = 0x3

.field public static final q:I = 0x4


# instance fields
.field private final r:Lcom/google/android/gms/internal/agm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/agm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/cast/a/a;->r:Lcom/google/android/gms/internal/agm;

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/a/a$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/agm;

    sget-object v1, Lcom/google/android/gms/cast/a;->l:Lcom/google/android/gms/cast/a$b;

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/internal/agm;-><init>(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/cast/a$b;)V

    invoke-static {v0}, Lcom/google/android/gms/cast/a/a;->a(Lcom/google/android/gms/internal/agm;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method static a(Lcom/google/android/gms/internal/agm;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/agm;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/a/a$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/a/a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/a/a;-><init>(Lcom/google/android/gms/internal/agm;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/agm;->a(Lcom/google/android/gms/cast/a/a;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
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

    iget-object v0, p0, Lcom/google/android/gms/cast/a/a;->r:Lcom/google/android/gms/internal/agm;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/agm;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()Lcom/google/android/gms/cast/a/b;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/a/a;->r:Lcom/google/android/gms/internal/agm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/agm;->e()Lcom/google/android/gms/cast/a/b;
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

.method public a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
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

    const/4 v0, 0x3

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/a/a;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/a/a$b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/cast/a/a;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/a/a;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/a/a$c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/a/a;->r:Lcom/google/android/gms/internal/agm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/agm;->a(Lcom/google/android/gms/cast/a/a$c;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/a/a;->r:Lcom/google/android/gms/internal/agm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/agm;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
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

    const/4 v0, 0x4

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/a/a;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public b(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/a/a$b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/cast/a/a;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/a/a;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/a/a;->r:Lcom/google/android/gms/internal/agm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/agm;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
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

    const/4 v0, 0x6

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/a/a;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public c(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/a/a$b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/cast/a/a;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/a/a;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/a/a;->r:Lcom/google/android/gms/internal/agm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/agm;->d()V

    return-void
.end method

.method public d(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
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

    const/4 v0, 0x5

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/a/a;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public d(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/a/a$b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/cast/a/a;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/a/a;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/a/a;->r:Lcom/google/android/gms/internal/agm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/agm;->g()Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
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

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/a/a;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public e(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/a/a$b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/cast/a/a;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/a/a;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
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

    iget-object v0, p0, Lcom/google/android/gms/cast/a/a;->r:Lcom/google/android/gms/internal/agm;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/agm;->b(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public f(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/a/a$b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/cast/a/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/cast/a/a;->f(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/a/a;->r:Lcom/google/android/gms/internal/agm;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/agm;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public g(Lorg/json/JSONObject;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/a/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/cast/a/a;->g(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
