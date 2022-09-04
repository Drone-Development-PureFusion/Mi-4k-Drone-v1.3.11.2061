.class public Lcom/google/android/gms/fitness/request/SessionReadRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/SessionReadRequest$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/SessionReadRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:J

.field private final e:J

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z

.field private final i:Z

.field private final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lcom/google/android/gms/internal/alo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/f;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/f;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;JJLjava/util/List;Ljava/util/List;ZZLjava/util/List;Landroid/os/IBinder;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;ZZ",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/os/IBinder;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->c:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->d:J

    iput-wide p6, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->e:J

    iput-object p8, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->f:Ljava/util/List;

    iput-object p9, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->g:Ljava/util/List;

    iput-boolean p10, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->h:Z

    iput-boolean p11, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->i:Z

    iput-object p12, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->j:Ljava/util/List;

    invoke-static {p13}, Lcom/google/android/gms/internal/alo$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/alo;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->k:Lcom/google/android/gms/internal/alo;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)V
    .locals 14

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->a(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->b(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->c(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)J

    move-result-wide v4

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->d(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)J

    move-result-wide v6

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->e(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Ljava/util/List;

    move-result-object v8

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->f(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Ljava/util/List;

    move-result-object v9

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->g(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Z

    move-result v10

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->h(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Z

    move-result v11

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->i(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v13}, Lcom/google/android/gms/fitness/request/SessionReadRequest;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Ljava/util/List;ZZLjava/util/List;Lcom/google/android/gms/internal/alo;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;Lcom/google/android/gms/fitness/request/SessionReadRequest$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest;-><init>(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/SessionReadRequest;Lcom/google/android/gms/internal/alo;)V
    .locals 14

    iget-object v2, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->c:Ljava/lang/String;

    iget-wide v4, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->d:J

    iget-wide v6, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->e:J

    iget-object v8, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->f:Ljava/util/List;

    iget-object v9, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->g:Ljava/util/List;

    iget-boolean v10, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->h:Z

    iget-boolean v11, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->i:Z

    iget-object v12, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->j:Ljava/util/List;

    move-object v1, p0

    move-object/from16 v13, p2

    invoke-direct/range {v1 .. v13}, Lcom/google/android/gms/fitness/request/SessionReadRequest;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Ljava/util/List;ZZLjava/util/List;Lcom/google/android/gms/internal/alo;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Ljava/util/List;ZZLjava/util/List;Lcom/google/android/gms/internal/alo;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;ZZ",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/alo;",
            ")V"
        }
    .end annotation

    const/4 v1, 0x5

    if-nez p12, :cond_0

    const/4 v13, 0x0

    :goto_0
    move-object v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v0 .. v13}, Lcom/google/android/gms/fitness/request/SessionReadRequest;-><init>(ILjava/lang/String;Ljava/lang/String;JJLjava/util/List;Ljava/util/List;ZZLjava/util/List;Landroid/os/IBinder;)V

    return-void

    :cond_0
    invoke-interface/range {p12 .. p12}, Lcom/google/android/gms/internal/alo;->asBinder()Landroid/os/IBinder;

    move-result-object v13

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/fitness/request/SessionReadRequest;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->b:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->c:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->d:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->e:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->f:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->f:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->g:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->g:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->h:Z

    iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->h:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->j:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->j:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->i:Z

    iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->i:Z

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->d:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->e:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->f:Ljava/util/List;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->g:Ljava/util/List;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->h:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest;->a(Lcom/google/android/gms/fitness/request/SessionReadRequest;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->j:Ljava/util/List;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->i:Z

    return v0
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->e:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->d:J

    return-wide v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->h:Z

    return v0
.end method

.method public k()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->k:Lcom/google/android/gms/internal/alo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->k:Lcom/google/android/gms/internal/alo;

    invoke-interface {v0}, Lcom/google/android/gms/internal/alo;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method l()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "sessionName"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "sessionId"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "startTimeMillis"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "endTimeMillis"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataTypes"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->f:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataSources"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->g:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "sessionsFromAllApps"

    iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "excludedPackages"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->j:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "useServer"

    iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->i:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/f;->a(Lcom/google/android/gms/fitness/request/SessionReadRequest;Landroid/os/Parcel;I)V

    return-void
.end method
