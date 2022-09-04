.class public Lcom/google/android/gms/fitness/request/DataReadRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/DataReadRequest;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:I


# instance fields
.field private final b:I

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation
.end field

.field private final e:J

.field private final f:J

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation
.end field

.field private final i:I

.field private final j:J

.field private final k:Lcom/google/android/gms/fitness/data/DataSource;

.field private final l:I

.field private final m:Z

.field private final n:Z

.field private final o:Lcom/google/android/gms/internal/akx;

.field private final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Device;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/t;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/t;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/util/List;Ljava/util/List;JJLjava/util/List;Ljava/util/List;IJLcom/google/android/gms/fitness/data/DataSource;IZZLandroid/os/IBinder;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;JJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;IJ",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            "IZZ",
            "Landroid/os/IBinder;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Device;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->b:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->c:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->d:Ljava/util/List;

    iput-wide p4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->e:J

    iput-wide p6, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->f:J

    iput-object p8, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->g:Ljava/util/List;

    iput-object p9, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->h:Ljava/util/List;

    iput p10, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->i:I

    iput-wide p11, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->j:J

    iput-object p13, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->k:Lcom/google/android/gms/fitness/data/DataSource;

    move/from16 v0, p14

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->l:I

    move/from16 v0, p15

    iput-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->m:Z

    move/from16 v0, p16

    iput-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->n:Z

    if-nez p17, :cond_2

    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->o:Lcom/google/android/gms/internal/akx;

    if-nez p18, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p18

    :cond_0
    move-object/from16 v0, p18

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->p:Ljava/util/List;

    if-nez p19, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p19

    :cond_1
    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->q:Ljava/util/List;

    return-void

    :cond_2
    invoke-static/range {p17 .. p17}, Lcom/google/android/gms/internal/akx$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/akx;

    move-result-object v1

    goto :goto_0
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)V
    .locals 20

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->a(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->b(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;

    move-result-object v3

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->c(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)J

    move-result-wide v4

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->d(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)J

    move-result-wide v6

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->e(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;

    move-result-object v8

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->f(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;

    move-result-object v9

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->g(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)I

    move-result v10

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)J

    move-result-wide v11

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->i(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v13

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->j(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)I

    move-result v14

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->k(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Z

    move-result v15

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->l(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Z

    move-result v16

    const/16 v17, 0x0

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->m(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;

    move-result-object v18

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->n(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;

    move-result-object v19

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v19}, Lcom/google/android/gms/fitness/request/DataReadRequest;-><init>(Ljava/util/List;Ljava/util/List;JJLjava/util/List;Ljava/util/List;IJLcom/google/android/gms/fitness/data/DataSource;IZZLcom/google/android/gms/internal/akx;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/DataReadRequest$a;Lcom/google/android/gms/fitness/request/DataReadRequest$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataReadRequest;-><init>(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/DataReadRequest;Lcom/google/android/gms/internal/akx;)V
    .locals 22

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->c:Ljava/util/List;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->d:Ljava/util/List;

    move-object/from16 v0, p1

    iget-wide v6, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->e:J

    move-object/from16 v0, p1

    iget-wide v8, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->f:J

    move-object/from16 v0, p1

    iget-object v10, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->g:Ljava/util/List;

    move-object/from16 v0, p1

    iget-object v11, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->h:Ljava/util/List;

    move-object/from16 v0, p1

    iget v12, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->i:I

    move-object/from16 v0, p1

    iget-wide v13, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->j:J

    move-object/from16 v0, p1

    iget-object v15, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->k:Lcom/google/android/gms/fitness/data/DataSource;

    move-object/from16 v0, p1

    iget v0, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->l:I

    move/from16 v16, v0

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->m:Z

    move/from16 v17, v0

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->n:Z

    move/from16 v18, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->p:Ljava/util/List;

    move-object/from16 v20, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/fitness/request/DataReadRequest;->q:Ljava/util/List;

    move-object/from16 v21, v0

    move-object/from16 v3, p0

    move-object/from16 v19, p2

    invoke-direct/range {v3 .. v21}, Lcom/google/android/gms/fitness/request/DataReadRequest;-><init>(Ljava/util/List;Ljava/util/List;JJLjava/util/List;Ljava/util/List;IJLcom/google/android/gms/fitness/data/DataSource;IZZLcom/google/android/gms/internal/akx;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;JJLjava/util/List;Ljava/util/List;IJLcom/google/android/gms/fitness/data/DataSource;IZZLcom/google/android/gms/internal/akx;Ljava/util/List;Ljava/util/List;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;JJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;IJ",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            "IZZ",
            "Lcom/google/android/gms/internal/akx;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Device;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const/4 v1, 0x6

    if-nez p16, :cond_0

    const/16 v17, 0x0

    :goto_0
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    invoke-direct/range {v0 .. v19}, Lcom/google/android/gms/fitness/request/DataReadRequest;-><init>(ILjava/util/List;Ljava/util/List;JJLjava/util/List;Ljava/util/List;IJLcom/google/android/gms/fitness/data/DataSource;IZZLandroid/os/IBinder;Ljava/util/List;Ljava/util/List;)V

    return-void

    :cond_0
    invoke-interface/range {p16 .. p16}, Lcom/google/android/gms/internal/akx;->asBinder()Landroid/os/IBinder;

    move-result-object v17

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/fitness/request/DataReadRequest;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->c:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->d:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->e:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->f:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->f:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->i:I

    iget v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->i:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->h:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->g:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->k:Lcom/google/android/gms/fitness/data/DataSource;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->k:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->j:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->j:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->n:Z

    iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->n:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->l:I

    iget v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->l:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->m:Z

    iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->m:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->o:Lcom/google/android/gms/internal/akx;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->o:Lcom/google/android/gms/internal/akx;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->p:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->p:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->q:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->q:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

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

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->e:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a()Ljava/util/List;
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

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->c:Ljava/util/List;

    return-object v0
.end method

.method public b(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->f:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Ljava/util/List;
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

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->d:Ljava/util/List;

    return-object v0
.end method

.method public c(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->j:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
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

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->g:Ljava/util/List;

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

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->h:Ljava/util/List;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->i:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/DataReadRequest;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataReadRequest;->a(Lcom/google/android/gms/fitness/request/DataReadRequest;)Z

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

.method public f()Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->k:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->l:I

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->n:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->f:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->m:Z

    return v0
.end method

.method j()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->b:I

    return v0
.end method

.method public k()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->f:J

    return-wide v0
.end method

.method public l()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->e:J

    return-wide v0
.end method

.method public m()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->j:J

    return-wide v0
.end method

.method public n()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->o:Lcom/google/android/gms/internal/akx;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->o:Lcom/google/android/gms/internal/akx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/akx;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Device;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->p:Ljava/util/List;

    return-object v0
.end method

.method public p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->q:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DataReadRequest{"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataType;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->i:I

    if-eqz v0, :cond_3

    const-string v0, "bucket by "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->i:I

    invoke-static {v2}, Lcom/google/android/gms/fitness/data/Bucket;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->j:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    const-string v0, " >"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->j:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "ms"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataType;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    const-string v0, "(%tF %tT - %tF %tT)"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->e:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->e:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->f:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->f:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->k:Lcom/google/android/gms/fitness/data/DataSource;

    if-eqz v0, :cond_6

    const-string v0, "activities: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->k:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/DataSource;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "quality: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataSource;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_7
    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->n:Z

    if-eqz v0, :cond_8

    const-string v0, " +server"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/t;->a(Lcom/google/android/gms/fitness/request/DataReadRequest;Landroid/os/Parcel;I)V

    return-void
.end method
