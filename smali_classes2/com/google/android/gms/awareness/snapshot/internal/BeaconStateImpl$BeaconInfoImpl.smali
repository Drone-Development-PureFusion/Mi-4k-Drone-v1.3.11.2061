.class public final Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/awareness/state/BeaconState$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BeaconInfoImpl"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/a;

    invoke-direct {v0}, Lcom/google/android/gms/awareness/snapshot/internal/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->a:I

    iput-object p2, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->d:[B

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->d:[B

    return-object v0
.end method

.method d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->d:[B

    if-nez v0, :cond_0

    const-string v0, "<null>"

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->c:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x6

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

    const-string v3, ", "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

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

    iget-object v1, p0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;->d:[B

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/awareness/snapshot/internal/a;->a(Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$BeaconInfoImpl;Landroid/os/Parcel;I)V

    return-void
.end method
