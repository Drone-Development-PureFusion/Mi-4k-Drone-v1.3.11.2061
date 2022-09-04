.class public final Lcom/google/android/gms/internal/pi;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/oj",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/internal/ok;


# instance fields
.field private final b:Lcom/google/android/gms/internal/nr;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/pi$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/pi$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/pi;->a:Lcom/google/android/gms/internal/ok;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/nr;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/pi;->b:Lcom/google/android/gms/internal/nr;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/pi$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/pi;-><init>(Lcom/google/android/gms/internal/nr;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->f()Lcom/google/android/gms/internal/ps;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/pi;->b:Lcom/google/android/gms/internal/nr;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/pi;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->d()Lcom/google/android/gms/internal/ps;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->e()Lcom/google/android/gms/internal/ps;

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/pi$2;->a:[I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/pq;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->a()V

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pi;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->b()V

    :goto_1
    return-object v0

    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/ow;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ow;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->c()V

    :goto_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pi;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->d()V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :pswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->k()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_1

    :pswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->i()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :pswitch_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->j()V

    const/4 v0, 0x0

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
