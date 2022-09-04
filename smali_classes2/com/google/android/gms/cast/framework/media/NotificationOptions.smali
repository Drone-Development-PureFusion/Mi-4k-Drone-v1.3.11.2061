.class public Lcom/google/android/gms/cast/framework/media/NotificationOptions;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/framework/media/NotificationOptions$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/cast/framework/media/NotificationOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:J = 0x2710L

.field public static final b:J = 0x7530L

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:[I


# instance fields
.field private final A:I

.field private final B:I

.field private final C:I

.field private final D:I

.field private final E:I

.field private final F:I

.field private final G:I

.field private final H:I

.field private final I:I

.field private final J:I

.field private final e:I

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:[I

.field private final h:J

.field private final i:Ljava/lang/String;

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:I

.field private final r:I

.field private final s:I

.field private final t:I

.field private final u:I

.field private final v:I

.field private final w:I

.field private final x:I

.field private final y:I

.field private final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x2

    new-array v0, v3, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "com.google.android.gms.cast.framework.action.STOP_CASTING"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->c:Ljava/util/List;

    new-array v0, v3, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->d:[I

    new-instance v0, Lcom/google/android/gms/cast/framework/media/g;

    invoke-direct {v0}, Lcom/google/android/gms/cast/framework/media/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data
.end method

.method public constructor <init>(ILjava/util/List;[IJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIII)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;[IJ",
            "Ljava/lang/String;",
            "IIIIIIIIIIIIIIIIIIIIIIIIIII)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->e:I

    if-eqz p2, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->f:Ljava/util/List;

    :goto_0
    if-eqz p3, :cond_1

    array-length v1, p3

    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->g:[I

    :goto_1
    iput-wide p4, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->h:J

    iput-object p6, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->i:Ljava/lang/String;

    iput p7, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->j:I

    iput p8, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->k:I

    iput p9, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->l:I

    iput p10, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->m:I

    iput p11, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->n:I

    iput p12, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->o:I

    iput p13, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->p:I

    move/from16 v0, p14

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->q:I

    move/from16 v0, p15

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->r:I

    move/from16 v0, p16

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->s:I

    move/from16 v0, p17

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->t:I

    move/from16 v0, p18

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->u:I

    move/from16 v0, p19

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->v:I

    move/from16 v0, p20

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->w:I

    move/from16 v0, p21

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->x:I

    move/from16 v0, p22

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->y:I

    move/from16 v0, p23

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->z:I

    move/from16 v0, p24

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->A:I

    move/from16 v0, p25

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->B:I

    move/from16 v0, p26

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->C:I

    move/from16 v0, p27

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->D:I

    move/from16 v0, p28

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->E:I

    move/from16 v0, p29

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->F:I

    move/from16 v0, p30

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->G:I

    move/from16 v0, p31

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->H:I

    move/from16 v0, p32

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->I:I

    move/from16 v0, p33

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->J:I

    return-void

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->f:Ljava/util/List;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->g:[I

    goto :goto_1
.end method

.method static synthetic G()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->c:Ljava/util/List;

    return-object v0
.end method

.method static synthetic H()[I
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->d:[I

    return-object v0
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->E:I

    return v0
.end method

.method public B()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->F:I

    return v0
.end method

.method public C()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->G:I

    return v0
.end method

.method public D()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->H:I

    return v0
.end method

.method public E()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->I:I

    return v0
.end method

.method public F()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->J:I

    return v0
.end method

.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->e:I

    return v0
.end method

.method public b()Ljava/util/List;
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

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->f:Ljava/util/List;

    return-object v0
.end method

.method public c()[I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->g:[I

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->g:[I

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    return-object v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->h:J

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->i:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->f:Ljava/util/List;

    iget-object v3, p1, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->f:Ljava/util/List;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->g:[I

    iget-object v3, p1, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->g:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-wide v2, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->h:J

    iget-wide v4, p1, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->h:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->i:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->j:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->k:I

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->l:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->f:Ljava/util/List;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->g:[I

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->h:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->i:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->m:I

    return v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->n:I

    return v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->o:I

    return v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->p:I

    return v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->q:I

    return v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->r:I

    return v0
.end method

.method public o()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->s:I

    return v0
.end method

.method public p()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->t:I

    return v0
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->u:I

    return v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->v:I

    return v0
.end method

.method public s()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->w:I

    return v0
.end method

.method public t()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->x:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v1, "NotificationOptions(actions=%s, compatActionIndices=%s, skipStepMs=%s, targetActivityClassName=%s)"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->f:Ljava/util/List;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->g:[I

    invoke-static {v4}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget-wide v4, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->h:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->i:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->y:I

    return v0
.end method

.method public v()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->z:I

    return v0
.end method

.method public w()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->A:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/cast/framework/media/g;->a(Lcom/google/android/gms/cast/framework/media/NotificationOptions;Landroid/os/Parcel;I)V

    return-void
.end method

.method public x()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->B:I

    return v0
.end method

.method public y()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->C:I

    return v0
.end method

.method public z()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/NotificationOptions;->D:I

    return v0
.end method
