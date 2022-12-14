.class public final Lcom/google/android/gms/games/video/VideoConfiguration;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/video/VideoConfiguration$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/games/video/VideoConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:I = 0x3

.field public static final b:I = 0x2

.field public static final c:I = 0x1

.field public static final d:I = 0x0

.field public static final e:I = -0x1

.field public static final f:I = 0x4

.field public static final g:I = -0x1

.field public static final h:I = 0x0

.field public static final i:I = 0x1

.field public static final j:I = 0x2


# instance fields
.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:Ljava/lang/String;

.field private final o:Ljava/lang/String;

.field private final p:Ljava/lang/String;

.field private final q:Ljava/lang/String;

.field private final r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/video/d;

    invoke-direct {v0}, Lcom/google/android/gms/games/video/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/video/VideoConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    const/4 v4, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->k:I

    invoke-static {p2, v2}, Lcom/google/android/gms/games/video/VideoConfiguration;->a(IZ)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-static {p3, v2}, Lcom/google/android/gms/games/video/VideoConfiguration;->b(IZ)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    iput p2, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->l:I

    iput p3, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->m:I

    iput-boolean p8, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->r:Z

    if-ne p3, v1, :cond_0

    iput-object p5, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->o:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->n:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->p:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->q:Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    if-nez p5, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Stream key should be null when not streaming"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-nez p4, :cond_2

    move v0, v1

    :goto_2
    const-string v3, "Stream url should be null when not streaming"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-nez p6, :cond_3

    move v0, v1

    :goto_3
    const-string v3, "Stream title should be null when not streaming"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-nez p7, :cond_4

    :goto_4
    const-string v0, "Stream description should be null when not streaming"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iput-object v4, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->o:Ljava/lang/String;

    iput-object v4, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->n:Ljava/lang/String;

    iput-object v4, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->p:Ljava/lang/String;

    iput-object v4, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->q:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_2

    :cond_3
    move v0, v2

    goto :goto_3

    :cond_4
    move v1, v2

    goto :goto_4
.end method

.method private constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    const/4 v1, 0x2

    move-object v0, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/games/video/VideoConfiguration;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/games/video/VideoConfiguration$1;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/google/android/gms/games/video/VideoConfiguration;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static a(IZ)Z
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p1, 0x0

    :goto_0
    :pswitch_0
    return p1

    :pswitch_1
    const/4 p1, 0x1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static b(IZ)Z
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p1, 0x0

    :goto_0
    :pswitch_0
    return p1

    :pswitch_1
    const/4 p1, 0x1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->k:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->l:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->m:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->o:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->n:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->p:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->q:Ljava/lang/String;

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/video/VideoConfiguration;->r:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/video/d;->a(Lcom/google/android/gms/games/video/VideoConfiguration;Landroid/os/Parcel;I)V

    return-void
.end method
