.class public Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;
.super Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TypeFilterImpl"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/internal/px$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/n;

    invoke-direct {v0}, Lcom/google/android/gms/awareness/snapshot/internal/n;-><init>()V

    sput-object v0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(I[B)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;-><init>()V

    iput p1, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->a:I

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/internal/px$a;->a([B)Lcom/google/android/gms/internal/px$a;
    :try_end_0
    .catch Lcom/google/android/gms/internal/rc; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    return-void

    :catch_0
    move-exception v1

    const-string v1, "BeaconStateImpl"

    const-string v2, "Could not deserialize BeaconFence.BeaconTypeFilter"

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/sw;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->a:I

    new-instance v0, Lcom/google/android/gms/internal/px$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/px$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/px$a;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/px$a;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->a:I

    new-instance v0, Lcom/google/android/gms/internal/px$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/px$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/px$a;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/px$a;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, v1, Lcom/google/android/gms/internal/px$a;->c:[B

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/px$a;->a:Ljava/lang/String;

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/px$a;->b:Ljava/lang/String;

    goto :goto_0
.end method

.method public c()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/px$a;->c:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/px$a;->c:[B

    array-length v0, v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/px$a;->c:[B

    goto :goto_0
.end method

.method public d()Lcom/google/android/gms/internal/px$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    return-object v0
.end method

.method e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;

    invoke-virtual {p0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->c()[B

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->c()[B

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method f()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b:Lcom/google/android/gms/internal/px$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;)[B

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-virtual {p0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->c()[B

    move-result-object v3

    if-nez v3, :cond_0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v1, v2

    invoke-static {v1}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->c()[B

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->c()[B

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "null"

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x4

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ","

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->c()[B

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/awareness/snapshot/internal/n;->a(Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;Landroid/os/Parcel;I)V

    return-void
.end method
