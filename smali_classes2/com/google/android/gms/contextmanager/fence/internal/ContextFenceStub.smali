.class public Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;
.super Lcom/google/android/gms/awareness/fence/AwarenessFence;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private b:Lcom/google/android/gms/internal/qa;

.field private c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/g;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/fence/internal/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(I[B)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/awareness/fence/AwarenessFence;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->b:Lcom/google/android/gms/internal/qa;

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c:[B

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->f()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/qa;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/awareness/fence/AwarenessFence;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a:I

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/qa;

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->b:Lcom/google/android/gms/internal/qa;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c:[B

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->f()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;
    .locals 14

    const/4 v2, 0x0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v13, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    const/4 v0, 0x3

    invoke-static {v1}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->e(Ljava/util/Collection;)[Lcom/google/android/gms/internal/qa;

    move-result-object v1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    move-object v8, v2

    move-object v9, v2

    move-object v10, v2

    move-object v11, v2

    move-object v12, v2

    invoke-static/range {v0 .. v12}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(I[Lcom/google/android/gms/internal/qa;Lcom/google/android/gms/internal/qt;Lcom/google/android/gms/internal/qh;Lcom/google/android/gms/internal/ql;Lcom/google/android/gms/internal/pv;Lcom/google/android/gms/internal/qp;Lcom/google/android/gms/internal/qm;Lcom/google/android/gms/internal/qk;Lcom/google/android/gms/internal/pw;Lcom/google/android/gms/internal/px;Lcom/google/android/gms/internal/qi;Lcom/google/android/gms/internal/qu;)Lcom/google/android/gms/internal/qa;

    move-result-object v0

    invoke-direct {v13, v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;-><init>(Lcom/google/android/gms/internal/qa;)V

    return-object v13
.end method

.method public static a(Lcom/google/android/gms/contextmanager/fence/internal/a;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;
    .locals 14

    const/4 v1, 0x0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    const/4 v0, 0x7

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/fence/internal/a;->a()Lcom/google/android/gms/internal/pv;

    move-result-object v5

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move-object v9, v1

    move-object v10, v1

    move-object v11, v1

    move-object v12, v1

    invoke-static/range {v0 .. v12}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(I[Lcom/google/android/gms/internal/qa;Lcom/google/android/gms/internal/qt;Lcom/google/android/gms/internal/qh;Lcom/google/android/gms/internal/ql;Lcom/google/android/gms/internal/pv;Lcom/google/android/gms/internal/qp;Lcom/google/android/gms/internal/qm;Lcom/google/android/gms/internal/qk;Lcom/google/android/gms/internal/pw;Lcom/google/android/gms/internal/px;Lcom/google/android/gms/internal/qi;Lcom/google/android/gms/internal/qu;)Lcom/google/android/gms/internal/qa;

    move-result-object v0

    invoke-direct {v13, v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;-><init>(Lcom/google/android/gms/internal/qa;)V

    return-object v13
.end method

.method public static a(Lcom/google/android/gms/contextmanager/fence/internal/b;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;
    .locals 14

    const/4 v1, 0x0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    const/16 v0, 0xb

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/fence/internal/b;->c()Lcom/google/android/gms/internal/pw;

    move-result-object v9

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move-object v10, v1

    move-object v11, v1

    move-object v12, v1

    invoke-static/range {v0 .. v12}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(I[Lcom/google/android/gms/internal/qa;Lcom/google/android/gms/internal/qt;Lcom/google/android/gms/internal/qh;Lcom/google/android/gms/internal/ql;Lcom/google/android/gms/internal/pv;Lcom/google/android/gms/internal/qp;Lcom/google/android/gms/internal/qm;Lcom/google/android/gms/internal/qk;Lcom/google/android/gms/internal/pw;Lcom/google/android/gms/internal/px;Lcom/google/android/gms/internal/qi;Lcom/google/android/gms/internal/qu;)Lcom/google/android/gms/internal/qa;

    move-result-object v0

    invoke-direct {v13, v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;-><init>(Lcom/google/android/gms/internal/qa;)V

    return-object v13
.end method

.method public static a(Lcom/google/android/gms/contextmanager/fence/internal/d;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;
    .locals 14

    const/4 v1, 0x0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    const/16 v0, 0xc

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/fence/internal/d;->a()Lcom/google/android/gms/internal/px;

    move-result-object v10

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move-object v9, v1

    move-object v11, v1

    move-object v12, v1

    invoke-static/range {v0 .. v12}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(I[Lcom/google/android/gms/internal/qa;Lcom/google/android/gms/internal/qt;Lcom/google/android/gms/internal/qh;Lcom/google/android/gms/internal/ql;Lcom/google/android/gms/internal/pv;Lcom/google/android/gms/internal/qp;Lcom/google/android/gms/internal/qm;Lcom/google/android/gms/internal/qk;Lcom/google/android/gms/internal/pw;Lcom/google/android/gms/internal/px;Lcom/google/android/gms/internal/qi;Lcom/google/android/gms/internal/qu;)Lcom/google/android/gms/internal/qa;

    move-result-object v0

    invoke-direct {v13, v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;-><init>(Lcom/google/android/gms/internal/qa;)V

    return-object v13
.end method

.method public static a(Lcom/google/android/gms/contextmanager/fence/internal/n;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;
    .locals 14

    const/4 v1, 0x0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    const/4 v0, 0x5

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/fence/internal/n;->a()Lcom/google/android/gms/internal/qh;

    move-result-object v3

    move-object v2, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move-object v9, v1

    move-object v10, v1

    move-object v11, v1

    move-object v12, v1

    invoke-static/range {v0 .. v12}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(I[Lcom/google/android/gms/internal/qa;Lcom/google/android/gms/internal/qt;Lcom/google/android/gms/internal/qh;Lcom/google/android/gms/internal/ql;Lcom/google/android/gms/internal/pv;Lcom/google/android/gms/internal/qp;Lcom/google/android/gms/internal/qm;Lcom/google/android/gms/internal/qk;Lcom/google/android/gms/internal/pw;Lcom/google/android/gms/internal/px;Lcom/google/android/gms/internal/qi;Lcom/google/android/gms/internal/qu;)Lcom/google/android/gms/internal/qa;

    move-result-object v0

    invoke-direct {v13, v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;-><init>(Lcom/google/android/gms/internal/qa;)V

    return-object v13
.end method

.method public static a(Lcom/google/android/gms/contextmanager/fence/internal/p;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;
    .locals 14

    const/4 v1, 0x0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    const/4 v0, 0x4

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/fence/internal/p;->a()Lcom/google/android/gms/internal/qt;

    move-result-object v2

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move-object v9, v1

    move-object v10, v1

    move-object v11, v1

    move-object v12, v1

    invoke-static/range {v0 .. v12}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(I[Lcom/google/android/gms/internal/qa;Lcom/google/android/gms/internal/qt;Lcom/google/android/gms/internal/qh;Lcom/google/android/gms/internal/ql;Lcom/google/android/gms/internal/pv;Lcom/google/android/gms/internal/qp;Lcom/google/android/gms/internal/qm;Lcom/google/android/gms/internal/qk;Lcom/google/android/gms/internal/pw;Lcom/google/android/gms/internal/px;Lcom/google/android/gms/internal/qi;Lcom/google/android/gms/internal/qu;)Lcom/google/android/gms/internal/qa;

    move-result-object v0

    invoke-direct {v13, v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;-><init>(Lcom/google/android/gms/internal/qa;)V

    return-object v13
.end method

.method public static a(I[Lcom/google/android/gms/internal/qa;Lcom/google/android/gms/internal/qt;Lcom/google/android/gms/internal/qh;Lcom/google/android/gms/internal/ql;Lcom/google/android/gms/internal/pv;Lcom/google/android/gms/internal/qp;Lcom/google/android/gms/internal/qm;Lcom/google/android/gms/internal/qk;Lcom/google/android/gms/internal/pw;Lcom/google/android/gms/internal/px;Lcom/google/android/gms/internal/qi;Lcom/google/android/gms/internal/qu;)Lcom/google/android/gms/internal/qa;
    .locals 5

    new-instance v1, Lcom/google/android/gms/internal/qa;

    invoke-direct {v1}, Lcom/google/android/gms/internal/qa;-><init>()V

    iput p0, v1, Lcom/google/android/gms/internal/qa;->a:I

    packed-switch p0, :pswitch_data_0

    const-string v2, "ContextFenceStub"

    const-string v3, "Unknown context fence type=%s"

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/sw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    :goto_0
    return-object v1

    :pswitch_0
    iput-object p1, v1, Lcom/google/android/gms/internal/qa;->b:[Lcom/google/android/gms/internal/qa;

    goto :goto_0

    :pswitch_1
    iput-object p2, v1, Lcom/google/android/gms/internal/qa;->c:Lcom/google/android/gms/internal/qt;

    goto :goto_0

    :pswitch_2
    iput-object p3, v1, Lcom/google/android/gms/internal/qa;->d:Lcom/google/android/gms/internal/qh;

    goto :goto_0

    :pswitch_3
    iput-object p4, v1, Lcom/google/android/gms/internal/qa;->e:Lcom/google/android/gms/internal/ql;

    goto :goto_0

    :pswitch_4
    iput-object p5, v1, Lcom/google/android/gms/internal/qa;->f:Lcom/google/android/gms/internal/pv;

    goto :goto_0

    :pswitch_5
    iput-object p6, v1, Lcom/google/android/gms/internal/qa;->g:Lcom/google/android/gms/internal/qp;

    goto :goto_0

    :pswitch_6
    iput-object p7, v1, Lcom/google/android/gms/internal/qa;->h:Lcom/google/android/gms/internal/qm;

    goto :goto_0

    :pswitch_7
    iput-object p8, v1, Lcom/google/android/gms/internal/qa;->i:Lcom/google/android/gms/internal/qk;

    goto :goto_0

    :pswitch_8
    iput-object p9, v1, Lcom/google/android/gms/internal/qa;->j:Lcom/google/android/gms/internal/pw;

    goto :goto_0

    :pswitch_9
    iput-object p10, v1, Lcom/google/android/gms/internal/qa;->k:Lcom/google/android/gms/internal/px;

    goto :goto_0

    :pswitch_a
    move-object/from16 v0, p11

    iput-object v0, v1, Lcom/google/android/gms/internal/qa;->l:Lcom/google/android/gms/internal/qi;

    goto :goto_0

    :pswitch_b
    move-object/from16 v0, p12

    iput-object v0, v1, Lcom/google/android/gms/internal/qa;->n:Lcom/google/android/gms/internal/qu;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch
.end method

.method public static c(Ljava/util/Collection;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;",
            ">;)",
            "Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    move v1, v0

    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v13, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    invoke-static {p0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->e(Ljava/util/Collection;)[Lcom/google/android/gms/internal/qa;

    move-result-object v1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    move-object v8, v2

    move-object v9, v2

    move-object v10, v2

    move-object v11, v2

    move-object v12, v2

    invoke-static/range {v0 .. v12}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(I[Lcom/google/android/gms/internal/qa;Lcom/google/android/gms/internal/qt;Lcom/google/android/gms/internal/qh;Lcom/google/android/gms/internal/ql;Lcom/google/android/gms/internal/pv;Lcom/google/android/gms/internal/qp;Lcom/google/android/gms/internal/qm;Lcom/google/android/gms/internal/qk;Lcom/google/android/gms/internal/pw;Lcom/google/android/gms/internal/px;Lcom/google/android/gms/internal/qi;Lcom/google/android/gms/internal/qu;)Lcom/google/android/gms/internal/qa;

    move-result-object v0

    invoke-direct {v13, v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;-><init>(Lcom/google/android/gms/internal/qa;)V

    return-object v13

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static d(Ljava/util/Collection;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;",
            ">;)",
            "Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;"
        }
    .end annotation

    const/4 v2, 0x0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v13, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    const/4 v0, 0x2

    invoke-static {p0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->e(Ljava/util/Collection;)[Lcom/google/android/gms/internal/qa;

    move-result-object v1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    move-object v8, v2

    move-object v9, v2

    move-object v10, v2

    move-object v11, v2

    move-object v12, v2

    invoke-static/range {v0 .. v12}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(I[Lcom/google/android/gms/internal/qa;Lcom/google/android/gms/internal/qt;Lcom/google/android/gms/internal/qh;Lcom/google/android/gms/internal/ql;Lcom/google/android/gms/internal/pv;Lcom/google/android/gms/internal/qp;Lcom/google/android/gms/internal/qm;Lcom/google/android/gms/internal/qk;Lcom/google/android/gms/internal/pw;Lcom/google/android/gms/internal/px;Lcom/google/android/gms/internal/qi;Lcom/google/android/gms/internal/qu;)Lcom/google/android/gms/internal/qa;

    move-result-object v0

    invoke-direct {v13, v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;-><init>(Lcom/google/android/gms/internal/qa;)V

    return-object v13

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->e()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c:[B

    invoke-static {v0}, Lcom/google/android/gms/internal/qa;->a([B)Lcom/google/android/gms/internal/qa;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->b:Lcom/google/android/gms/internal/qa;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c:[B
    :try_end_0
    .catch Lcom/google/android/gms/internal/rc; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->f()V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "ContextFenceStub"

    const-string v2, "Could not deserialize context fence bytes."

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/sw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->b:Lcom/google/android/gms/internal/qa;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static e(Ljava/util/Collection;)[Lcom/google/android/gms/internal/qa;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;",
            ">;)[",
            "Lcom/google/android/gms/internal/qa;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v3, v0, [Lcom/google/android/gms/internal/qa;

    const/4 v0, 0x0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c()Lcom/google/android/gms/internal/qa;

    move-result-object v0

    aput-object v0, v3, v1

    move v1, v2

    goto :goto_0

    :cond_0
    return-object v3
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->b:Lcom/google/android/gms/internal/qa;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c:[B

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->b:Lcom/google/android/gms/internal/qa;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c:[B

    if-eqz v0, :cond_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->b:Lcom/google/android/gms/internal/qa;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c:[B

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid internal representation - full"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->b:Lcom/google/android/gms/internal/qa;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c:[B

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid internal representation - empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Impossible"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a:I

    return v0
.end method

.method public b()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c:[B

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->b:Lcom/google/android/gms/internal/qa;

    invoke-static {v0}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;)[B

    move-result-object v0

    goto :goto_0
.end method

.method public c()Lcom/google/android/gms/internal/qa;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->d()V

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->b:Lcom/google/android/gms/internal/qa;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->d()V

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->b:Lcom/google/android/gms/internal/qa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/qa;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/g;->a(Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;Landroid/os/Parcel;I)V

    return-void
.end method
